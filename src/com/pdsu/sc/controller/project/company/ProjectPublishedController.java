package com.pdsu.sc.controller.project.company;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.po.ApplicationExample;
import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectExample;
import com.pdsu.sc.po.IssusdProjectKey;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.Title;
import com.pdsu.sc.service.ApplicationService;
import com.pdsu.sc.service.ArticleFileService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TitleService;

/**
 * 公司已下达的项目
 */
@Controller
public class ProjectPublishedController {
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	@Autowired
	private ApplicationService applicationServiceImpl;
	@Autowired
	private ArticleFileService articleFileServiceImpl;
	@Autowired
	private TitleService titleServiceImpl;
	@Autowired
	private TeammappingService teammappingServiceImpl;
	/**
	 * 获取已下达项目页面
	 */
	@RequestMapping(value="/company/projectPublished",method=RequestMethod.GET)
	public String getProjectPublishedPage(HttpServletRequest request,HttpSession httpSession){
		//先获取登录信息
		Login login=(Login) httpSession.getAttribute("userData");
		if(login==null){//说明没有登录信息
			return "behind/login";
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
		IssusdProjectExample issusdProjectExample=new IssusdProjectExample();
		IssusdProjectExample.Criteria issusdProjectExampleCriteria=issusdProjectExample.createCriteria();
		if(enId!=null){
			issusdProjectExampleCriteria.andEnIdEqualTo(enId);
		}
		issusdProjectExample.setOrderByClause("en_issusdtime DESC");
		List<IssusdProject> issusdProjectList=issusdProjectServiceImpl.selectIssusdProject(issusdProjectExample);
		request.setAttribute("issusdProjectList", issusdProjectList);
		return "behind/company/projectPublished";
	}
	
	/**
	 * 删除已下达的项目
	 */
	//@ResponseBody
	@RequestMapping(value="/company/projectPublished/delete",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String deleteProjectPublished(HttpServletRequest request,HttpSession httpSession,HttpServletResponse response){
		String[] ip_ids=request.getParameterValues("ip_id");
		if(ip_ids!=null){
			Integer ipId=null;
			int okCount=0;
			for(String ip_id:ip_ids){
				try{
					ipId=Integer.parseInt(ip_id);
				}catch(Exception e){break;}
				if(ipId!=null){
					//先获取这个下达项目
					IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
					issusdProjectKey.setIpId(ipId);
					IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
					if(issusdProject!=null){//说明存在这个下达项目
						//先把团队的申请删除
						ApplicationExample applicationExample=new ApplicationExample();
						ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
						applicationExampleCriteria.andApProjectidEqualTo(ipId);
						applicationServiceImpl.deleteByExample(applicationExample);
						//删除文章
						Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
						if(title!=null){//文章存在，先删除文件
							articleFileServiceImpl.deleteArticleFile(title.getTiAddressurl());
							titleServiceImpl.removeTitle(issusdProject.getTiId());
						}
						//删除这个下达项目
						IssusdProjectKey issusdProjectKeyKey=new IssusdProjectKey();
						issusdProjectKeyKey.setIpId(ipId);
						issusdProjectServiceImpl.removeIssusdProject(issusdProjectKeyKey);
						okCount++;
					}
				}
			}
		}
			//先获取登录信息
			Login login=(Login) httpSession.getAttribute("userData");
			if(login==null){//说明没有登录信息
				return "behind/login";
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
			IssusdProjectExample issusdProjectExample=new IssusdProjectExample();
			IssusdProjectExample.Criteria issusdProjectExampleCriteria=issusdProjectExample.createCriteria();
			if(enId!=null){
				issusdProjectExampleCriteria.andEnIdEqualTo(enId);
			}
			issusdProjectExample.setOrderByClause("en_issusdtime DESC");
			List<IssusdProject> issusdProjectList=issusdProjectServiceImpl.selectIssusdProject(issusdProjectExample);
			request.setAttribute("issusdProjectList", issusdProjectList);
			return "behind/company/projectPublished";
	}
	
	/**
	 * 获取下达的项目编辑页面
	 */
	@RequestMapping(value="/company/projectPublished/edit/{ipId}",method=RequestMethod.GET)
	public String getProjectPublishedEditPage(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null){
			return "behind/404";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "behind/404";
		}//下达的项目存在，查文章地址
		Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
		request.setAttribute("issusdProject", issusdProject);
		request.setAttribute("title", title);
		return "behind/company/projectPublishedUpdate";
	}
	
	/**
	 * 下达的项目编辑后提交保存
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/edit/{ipId}/save",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String saveProjectPublishedEditContent(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null){
			return "项目id不存在";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "下达的项目不存在";
		}
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
		} else {//开始保存内容
			Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
			//先获取源文件以便出错还原
			String articleContent_0=articleFileServiceImpl.readArticleFile(title.getTiAddressurl());
			//先保存文件
			String updateReult=articleFileServiceImpl.updateArticleFile(title.getTiAddressurl(), articleContent);
			if(!"success".equals(updateReult)){//说明保存出错了
				return updateReult;
			}//没错就 更新项目 名称和简介
			issusdProject.setIpProjectname(ipProjectname);
			issusdProject.setIpBriefintroduction(ipBriefintroduction);
			int updateIssusdProjectResult=issusdProjectServiceImpl.modifyIssusdProject(issusdProject);
			if(updateIssusdProjectResult<1){//说明没有更新成功
				//还原更新前的内容
				articleFileServiceImpl.updateArticleFile(title.getTiAddressurl(), articleContent_0);
			}
			return "success";
		}
	}
	
}
