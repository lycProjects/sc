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
 * ��˾���´����Ŀ
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
	 * ��ȡ���´���Ŀҳ��
	 */
	@RequestMapping(value="/company/projectPublished",method=RequestMethod.GET)
	public String getProjectPublishedPage(HttpServletRequest request,HttpSession httpSession){
		//�Ȼ�ȡ��¼��Ϣ
		Login login=(Login) httpSession.getAttribute("userData");
		if(login==null){//˵��û�е�¼��Ϣ
			return "behind/login";
		}
		//��ȡ��˾��Ϣ
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
	 * ɾ�����´����Ŀ
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
					//�Ȼ�ȡ����´���Ŀ
					IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
					issusdProjectKey.setIpId(ipId);
					IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
					if(issusdProject!=null){//˵����������´���Ŀ
						//�Ȱ��Ŷӵ�����ɾ��
						ApplicationExample applicationExample=new ApplicationExample();
						ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
						applicationExampleCriteria.andApProjectidEqualTo(ipId);
						applicationServiceImpl.deleteByExample(applicationExample);
						//ɾ������
						Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
						if(title!=null){//���´��ڣ���ɾ���ļ�
							articleFileServiceImpl.deleteArticleFile(title.getTiAddressurl());
							titleServiceImpl.removeTitle(issusdProject.getTiId());
						}
						//ɾ������´���Ŀ
						IssusdProjectKey issusdProjectKeyKey=new IssusdProjectKey();
						issusdProjectKeyKey.setIpId(ipId);
						issusdProjectServiceImpl.removeIssusdProject(issusdProjectKeyKey);
						okCount++;
					}
				}
			}
		}
			//�Ȼ�ȡ��¼��Ϣ
			Login login=(Login) httpSession.getAttribute("userData");
			if(login==null){//˵��û�е�¼��Ϣ
				return "behind/login";
			}
			//��ȡ��˾��Ϣ
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
	 * ��ȡ�´����Ŀ�༭ҳ��
	 */
	@RequestMapping(value="/company/projectPublished/edit/{ipId}",method=RequestMethod.GET)
	public String getProjectPublishedEditPage(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null){
			return "behind/404";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "behind/404";
		}//�´����Ŀ���ڣ������µ�ַ
		Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
		request.setAttribute("issusdProject", issusdProject);
		request.setAttribute("title", title);
		return "behind/company/projectPublishedUpdate";
	}
	
	/**
	 * �´����Ŀ�༭���ύ����
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/edit/{ipId}/save",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String saveProjectPublishedEditContent(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null){
			return "��Ŀid������";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "�´����Ŀ������";
		}
		String ipProjectname = request.getParameter("ipProjectname");
		String ipBriefintroduction = request.getParameter("ipBriefintroduction");
		String articleContent=request.getParameter("articleContent");
		try {
			// ˫����
			articleContent = URLDecoder.decode(articleContent, "utf-8");
			articleContent = URLDecoder.decode(articleContent, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			return "�����½���ʱʧ��";
		}
		if (ipProjectname == null || "".equals(ipProjectname)) {
			return "���ⲻ��Ϊ��";
		} else {//��ʼ��������
			Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
			//�Ȼ�ȡԴ�ļ��Ա����ԭ
			String articleContent_0=articleFileServiceImpl.readArticleFile(title.getTiAddressurl());
			//�ȱ����ļ�
			String updateReult=articleFileServiceImpl.updateArticleFile(title.getTiAddressurl(), articleContent);
			if(!"success".equals(updateReult)){//˵�����������
				return updateReult;
			}//û��� ������Ŀ ���ƺͼ��
			issusdProject.setIpProjectname(ipProjectname);
			issusdProject.setIpBriefintroduction(ipBriefintroduction);
			int updateIssusdProjectResult=issusdProjectServiceImpl.modifyIssusdProject(issusdProject);
			if(updateIssusdProjectResult<1){//˵��û�и��³ɹ�
				//��ԭ����ǰ������
				articleFileServiceImpl.updateArticleFile(title.getTiAddressurl(), articleContent_0);
			}
			return "success";
		}
	}
	
}
