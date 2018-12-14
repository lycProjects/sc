package com.pdsu.sc.controller.project.company;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.news.util.UEditorUploader;
import com.pdsu.sc.po.Enterprise;
import com.pdsu.sc.po.EnterpriseKey;
import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;
import com.pdsu.sc.service.ArticleFileService;
import com.pdsu.sc.service.EnterpriseService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TitleService;
/**
 * 下达项目
 */
@Controller
public class ProjectPublishController {
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	@Autowired
	private ArticleFileService articleFileServiceImpl;
	@Autowired
	private TitleService titleServiceImpl;
	@Autowired
	private TeammappingService teammappingServiceImpl;
	@Autowired
	private EnterpriseService enterpriseServiceImpl;
	
	/**
	 * 发布下达项目文章图片存储地址
	 */
	private static String HtmlArticle_ImagesUri = "DataFile/articles/images";
	
	/**
	 * 获取发布项目页面
	 */
	@RequestMapping(value="/company/projectPublish",method=RequestMethod.GET)
	public String getProjectPublishPage(HttpServletRequest request){
		String enterpriseMsgShowString="请输入一个公司ID来发布项目：\\nID    公司名称 \\n";
		List<Enterprise> enterprises=enterpriseServiceImpl.selectEnterprise(null);
		for(Enterprise enterprise:enterprises){
			enterpriseMsgShowString="  "+enterpriseMsgShowString+enterprise.getEnId()+"     "+enterprise.getEnName()+"\\n";
		}
		request.setAttribute("enterpriseMsgShowString", enterpriseMsgShowString);
		return "behind/company/projectPublish";
	}
	
	/**
	 * 上传图片接口
	 */
	@ResponseBody
	@RequestMapping(value = "/company/projectPublish/image", method = RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String getArticleUplodeImageManagerAction(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.err.println("对请求设定编码时出错：ProjectPublishController.getArticleUplodeImageManagerAction()");
		}
		response.setCharacterEncoding("utf-8");
		UEditorUploader up = new UEditorUploader(request);
		up.setSavePath(HtmlArticle_ImagesUri);
		String[] fileType = { ".gif", ".png", ".jpg", ".jpeg", ".bmp" };
		up.setAllowFiles(fileType);
		up.setMaxSize(10000); // 单位KB
		try {
			up.upload();
		} catch (Exception e) {
			System.err.println("文章图片文件上传失败：ProjectPublishController.getArticleUplodeImageManagerAction()");
		}
		String callback = request.getParameter("callback");
		String result = "{\"name\":\"" + up.getFileName() + "\", \"originalName\": \"" + up.getOriginalName()
				+ "\", \"size\": " + up.getSize() + ", \"state\": \"" + up.getState() + "\", \"type\": \""
				+ up.getType() + "\", \"url\": \"" + up.getUrl() + "\"}";
		result = result.replaceAll("\\\\", "\\\\");
		/*
		 * PrintWriter pw=null; try { pw = response.getWriter(); } catch
		 * (IOException e) { System.err.println(
		 * "获取response.getWriter()输出流时出错：NewsController.getNewsUplodeImageManagerAction()"
		 * ); } if(pw!=null){ if(callback == null ){ pw.write(result); }else{
		 * pw.write("<script>"+ callback +"(" + result + ")</script>"); } }
		 */
		if (callback == null) {
			return result;
		} else {
			return "<script>" + callback + "(" + result + ")</script>";
		}
	}
	
	/**
	 * 发布项目
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublish",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String postProjectPublish(HttpServletRequest request,HttpSession httpSession){
		String ipProjectname = request.getParameter("ipProjectname");
		String ipBriefintroduction = request.getParameter("ipBriefintroduction");
		String articleContent=request.getParameter("articleContent");
		try {
			// 双解码
			articleContent = URLDecoder.decode(articleContent, "utf-8");
			articleContent = URLDecoder.decode(articleContent, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			return "对文章解码时失败";
		}
		if (ipProjectname == null || "".equals(ipProjectname)) {
			return "标题不能为空";
		} else {
			//先获取登录信息
			Login login=(Login) httpSession.getAttribute("userData");
			if(login==null){//说明没有登录信息
				return "请先登录";
			}
			//获取公司信息
			Integer tmmId=login.getLoTeam();
			Integer enId=null;
			if(tmmId==null||tmmId<1){
				try{
					enId=Integer.parseInt(request.getParameter("enId"));
				}catch(Exception e){}
			}else{
				Teammapping teamMapping=teammappingServiceImpl.selectByPrimaryKey(tmmId);
				if(teamMapping!=null){
					enId=teamMapping.getEnId();
				}
			}
			if(enId==null){
				return "参数错误，无获取到公司id";
			}
			EnterpriseKey key=new EnterpriseKey();
			key.setEnId(enId);
			Enterprise enterprise=enterpriseServiceImpl.selectEnterpriseByPrimaryKey(key);
			if(enterprise==null){
				return "公司不存在";
			}
			//先插入文章
			Title title=new Title();
			//文章类型为3下达项目的文章
			title.setTiType(1);
			title.setTiMentionedabove("发布公司");
			title.setTiAuther(enterprise.getEnName());
			title.setTiAutherid(tmmId);
			//存储文章
			String addResult=articleFileServiceImpl.addArticleFile(null, articleContent);
			if(addResult.startsWith("/")){//表示添加成功
				title.setTiAddressurl(addResult);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
				String publishTime=sdf.format(new Date());
				title.setTiReleasetime(publishTime);
				//插入文章
				int addTitleResult=titleServiceImpl.addTitle(title);
				if(addTitleResult>0){//插入成功
					//获取该文章的id
					TitleExample titleExample=new TitleExample();
					TitleExample.Criteria titleExampleCriteria=titleExample.createCriteria();
					//一般文章uri就是唯一的，但又加了公司id，以保证不出错
					titleExampleCriteria.andTiAddressurlEqualTo(addResult);
					titleExampleCriteria.andTiAutheridEqualTo(tmmId);
					List<Title> titlesFromDateBase=titleServiceImpl.selectTitle(titleExample);
					if(titlesFromDateBase.size()<1){

						//失败之后的操作
						
						//删除已添加文章文件
						articleFileServiceImpl.deleteArticleFile(addResult);
						return "获取文章id失败";
					}
					Integer titleId=titlesFromDateBase.get(0).getTiId();
					//保存下达项目到数据库
					IssusdProject issusdProject=new IssusdProject();
					issusdProject.setIpProjectname(ipProjectname);
					issusdProject.setEnId(enId);
					issusdProject.setTiId(titleId);
					issusdProject.setEnName(enterprise.getEnName());
					issusdProject.setIpBriefintroduction(ipBriefintroduction);
					//设置项目状态
					issusdProject.setEnProjectstate(1);
					issusdProject.setEnStatename("等待团队申请");
					issusdProject.setEnIssusdtime(publishTime);
					int addIssusdProjectResult=issusdProjectServiceImpl.addIssusdProject(issusdProject);
					if(addIssusdProjectResult>0){
						return "success";
					}
					
					//失败之后的操作
					
					//删除已添加到数据库的文章
					titleServiceImpl.removeTitle(titleId);
					//删除已添加文章文件
					articleFileServiceImpl.deleteArticleFile(addResult);
					return "保存下达项目失败";
				}

				//失败之后的操作
				
				//删除已添加文章文件
				articleFileServiceImpl.deleteArticleFile(addResult);
				return "保存文章失败";
			}
			return addResult;
		}
	}

	
}
