package com.pdsu.sc.controller.project.team;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.Title;
import com.pdsu.sc.service.ApplicationService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TitleService;

/**
 * 申请项目
 */
@Controller
public class ProjectApplyController {
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	@Autowired
	private ApplicationService applicationServiceImpl;
	@Autowired
	private TeammappingService teammappingServiceImpl;
	@Autowired
	private TitleService titleServiceImpl;
	/**
	 * 获取申请项目页面
	 */
	@RequestMapping(value="/team/IssusdProject/{ipId}/details",method=RequestMethod.GET)
	public String getProjectApplyPage(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
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
		return "behind/company/team-projectDescription";
	}
	
	/**
	 * 申请某个项目
	 */
	@ResponseBody
	@RequestMapping(value="/team/IssusdProject/{ipId}/apply",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String applyIssusdPrjectAction(@PathVariable("ipId") Integer ipId,HttpServletRequest request,HttpSession httpSession){
		if(ipId==null){
			return "参数错误";
		}
		String apReason=request.getParameter("apReason").trim();
		if(apReason==null||"".equals(apReason)){
			return "申请理由不能为空";
		}
		//先获取登录信息
		Login login=(Login) httpSession.getAttribute("userData");
		if(login==null){//说明没有登录信息
			return "请先登录";
		}
		//获取团队id信息
		Integer tmmId=login.getLoTeam();
		if(tmmId==null||tmmId<0){
			try{
				tmmId=Integer.parseInt(request.getParameter("tmmId"));
			}catch(Exception e){}
		}
		if(tmmId==null){
			return "参数错误，无获取到团队id";
		}
		Teammapping teammapping=teammappingServiceImpl.selectByPrimaryKey(tmmId);
		if(teammapping==null){
			return "团队不存在";
		}
		//开始查询
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "下达项目不存在";
		}//看是不是已经申请过这个项目
		ApplicationExample applicationExample=new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
		applicationExampleCriteria.andApProjectidEqualTo(ipId);
		applicationExampleCriteria.andApTeamidEqualTo(tmmId);
		long countIssusdProjectApplications=applicationServiceImpl.countByExample(applicationExample);
		if(countIssusdProjectApplications>0){
			return "不能重复申请这个项目";
		}//开始申请这个项目
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String nowTime=sdf.format(new Date());
		Application application=new Application();
		application.setApState(1);
		application.setApStatename("等待确认");
		application.setApProjectid(ipId);
		application.setApProjectname(issusdProject.getIpProjectname());
		application.setApTeamid(tmmId);
		application.setApTeamname(teammapping.getTmmName());
		application.setApTime(nowTime);
		application.setApReason(apReason);
		application.setApHandletime(nowTime);
		int addApplicationResult=applicationServiceImpl.addApplication(application);
		if(addApplicationResult<1){
			return "发布申请失败";
		}
		return "success";
	}
	
}
