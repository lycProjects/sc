package com.pdsu.sc.controller.project.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.ApplicationExample;
import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectKey;
import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;
import com.pdsu.sc.service.ApplicationService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.TitleService;

/**
 * 公司已发布项目的详情
 */
@Controller
public class ProjectPublishedDetailsController {
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	@Autowired
	private ApplicationService applicationServiceImpl;
	@Autowired
	private TitleService titleServiceImpl;
	/**
	 * 获取下达的项目详情页面
	 */
	@RequestMapping(value="/company/projectPublished/details/{ipId}",method=RequestMethod.GET)
	public String getProjectPublishedDetailsPage(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null){
			return "behind/404";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "behind/404";
		}//获取文章信息
		Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
		//获取所有的团队项目申请
		ApplicationExample applicationExample=new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
		applicationExampleCriteria.andApProjectidEqualTo(ipId);
		List<Application> applications=applicationServiceImpl.selectApplication(applicationExample);
		request.setAttribute("issusdProject", issusdProject);
		request.setAttribute("applications", applications);
		request.setAttribute("title", title);
		request.setAttribute("canDoAction", request.getParameter("canDoAction"));
		
		return "behind/company/projectPublishedDetails";
	}
	
	/**
	 * 同意某个团队对项目的申请
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/details/{ipId}/agree/{applicationId}",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String agreeTeamApplicationAction(@PathVariable("ipId") Integer ipId,@PathVariable("applicationId") Integer applicationId,HttpServletRequest request){
		if(ipId==null||ipId<0){
			return "项目id有误";
		}
		if(applicationId==null||applicationId<0){
			return "申请id有误";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "下达项目不存在";
		}//看是否符合条件
		//看项目是不是在等待申请状态
		if(issusdProject.getEnProjectstate()!=1){
			return "下达项目不符和同意申请条件";
		}//符合了条件就获取该 团队的申请
		Application application=applicationServiceImpl.selectApplicationByPrimaryKey(applicationId);
		if(application==null){
			return "该项目申请不存在";
		}//存在就先把 该下达项目下的所有申请都改为已失效
		Application applicationModifyBean=new Application();
		applicationModifyBean.setApState(6);
		applicationModifyBean.setApStatename("申请已失效");
		ApplicationExample applicationModifyBeanExample=new ApplicationExample();
		ApplicationExample.Criteria applicationModifyBeanExampleCriteria=applicationModifyBeanExample.createCriteria();
		applicationModifyBeanExampleCriteria.andApProjectidEqualTo(ipId);
		int modifyApsResult=applicationServiceImpl.modifyByExampleSelective(applicationModifyBean, applicationModifyBeanExample);
		if(modifyApsResult<1){
			return "修改申请状态失败";
		}
		//再把当前申请改成已通过
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String apHandletime=sdf.format(new Date());
		application.setApState(4);
		application.setApStatename("已通过");
		application.setApHandletime(apHandletime);
		applicationServiceImpl.modifyApplication(application);
		//把该下达项目的状态改成进行中
		issusdProject.setEnProjectstate(2);
		issusdProject.setEnStatename("进行中");
		issusdProjectServiceImpl.modifyIssusdProject(issusdProject);
		return "success";
	}
	
	/**
	 * 拒绝某个团队对项目的申请
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/details/{ipId}/disagree/{applicationId}",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String disagreeTeamApplicationAction(@PathVariable("ipId") Integer ipId,@PathVariable("applicationId") Integer applicationId,HttpServletRequest request){
		if(ipId==null||ipId<0){
			return "项目id有误";
		}
		if(applicationId==null||applicationId<0){
			return "申请id有误";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "下达项目不存在";
		}//看是否符合条件
		//看项目是不是在等待申请状态
		if(issusdProject.getEnProjectstate()!=1){
			return "下达项目不符和拒绝申请条件";
		}//符合了条件就获取该 团队的申请
		Application application=applicationServiceImpl.selectApplicationByPrimaryKey(applicationId);
		if(application==null){
			return "该项目申请不存在";
		}//把当前申请改成已拒绝
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String apHandletime=sdf.format(new Date());
		application.setApState(3);
		application.setApStatename("已拒绝");
		application.setApHandletime(apHandletime);
		applicationServiceImpl.modifyApplication(application);
		return "success";
	}
	
	/**
	 * 对某个项目结项
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/details/{ipId}/endProject",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String endIssusdProjectAction(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null||ipId<0){
			return "项目id有误";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "下达项目不存在";
		}//看是否符合条件
		//看项目是不是在进行状态
		if(issusdProject.getEnProjectstate()!=2){
			return "下达项目不符和结项条件";
		}//符合了条件就获取该 正在进行的项目的团队的申请
		ApplicationExample applicationExample=new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
		applicationExampleCriteria.andApProjectidEqualTo(ipId);
		applicationExampleCriteria.andApStateEqualTo(4);
		List<Application> applications=applicationServiceImpl.selectApplication(applicationExample);
		if(applications==null||applications.size()<1){
			return "该项目的团队申请不存在";
		}//把当前申请改成已完项
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String nowTime=sdf.format(new Date());
		Application application=applications.get(0);
		application.setApState(4);
		application.setApStatename("已完项");
		application.setApHandletime(nowTime);
		applicationServiceImpl.modifyApplication(application);
		//改下达项目的状态
		issusdProject.setEnProjectstate(3);
		issusdProject.setEnStatename("已完项");
		issusdProject.setEnProjectover(nowTime);
		issusdProjectServiceImpl.modifyIssusdProject(issusdProject);
		return "success";
	}
}
