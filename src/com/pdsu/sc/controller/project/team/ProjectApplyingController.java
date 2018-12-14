package com.pdsu.sc.controller.project.team;

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
import com.pdsu.sc.po.Login;
import com.pdsu.sc.service.ApplicationService;

/**
 * 正在申请的项目
 */
@Controller
public class ProjectApplyingController {
	@Autowired
	private ApplicationService applicationServiceImpl;

	/**
	 * 获取正在申请的项目页面
	 */
	@RequestMapping(value = "/team/projectApplying", method = RequestMethod.GET)
	public String getProjectApplyingPage(HttpServletRequest request, HttpSession httpSession) {
		// 先获取登录信息
		Login login = (Login) httpSession.getAttribute("userData");
		if (login == null) {// 说明没有登录信息
			return "behind/login";
		}
		// 获取团队id信息
		Integer tmmId = login.getLoTeam();
		if (tmmId == null || tmmId < 0) {
			try {
				tmmId = Integer.parseInt(request.getParameter("tmmId"));
			} catch (Exception e) {
			}
		}
		if (tmmId == null) {
			return "behind/404";
		}
		ApplicationExample applicationExample = new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria = applicationExample.createCriteria();
		applicationExampleCriteria.andApTeamidEqualTo(tmmId);
		applicationExample.setOrderByClause("ap_handletime DESC");
		List<Application> applicationList = applicationServiceImpl.selectApplication(applicationExample);
		request.setAttribute("applicationList", applicationList);
		return "behind/company/team-projectApply";
	}

	/**
	 * 取消对某个项目的申请
	 */
	@ResponseBody
	@RequestMapping(value = "/team/projectApplying/{apId}/cancel", method = RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String cancelApplicationAction(@PathVariable("apId") Integer apId) {
		if (apId == null || apId < 0) {
			return "参数错误";
		}
		Application application=applicationServiceImpl.selectApplicationByPrimaryKey(apId);
		if(application==null){
			return "该申请不存在";
		}
		if(application.getApState()!=1){
			return "不能取消该申请";
		}
		int cancelResult = applicationServiceImpl.removeApplication(apId);
		if (cancelResult < 1) {
			return "取消失败";
		}
		return "success";
	}
}
