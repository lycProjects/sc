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
 * �����������Ŀ
 */
@Controller
public class ProjectApplyingController {
	@Autowired
	private ApplicationService applicationServiceImpl;

	/**
	 * ��ȡ�����������Ŀҳ��
	 */
	@RequestMapping(value = "/team/projectApplying", method = RequestMethod.GET)
	public String getProjectApplyingPage(HttpServletRequest request, HttpSession httpSession) {
		// �Ȼ�ȡ��¼��Ϣ
		Login login = (Login) httpSession.getAttribute("userData");
		if (login == null) {// ˵��û�е�¼��Ϣ
			return "behind/login";
		}
		// ��ȡ�Ŷ�id��Ϣ
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
	 * ȡ����ĳ����Ŀ������
	 */
	@ResponseBody
	@RequestMapping(value = "/team/projectApplying/{apId}/cancel", method = RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String cancelApplicationAction(@PathVariable("apId") Integer apId) {
		if (apId == null || apId < 0) {
			return "��������";
		}
		Application application=applicationServiceImpl.selectApplicationByPrimaryKey(apId);
		if(application==null){
			return "�����벻����";
		}
		if(application.getApState()!=1){
			return "����ȡ��������";
		}
		int cancelResult = applicationServiceImpl.removeApplication(apId);
		if (cancelResult < 1) {
			return "ȡ��ʧ��";
		}
		return "success";
	}
}
