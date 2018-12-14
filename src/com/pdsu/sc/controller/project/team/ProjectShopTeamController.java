package com.pdsu.sc.controller.project.team;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.service.IssusdProjectService;

/**
 * �Ŷӵ�½������Ŀ�г�
 * @author Administrator
 *
 */
@Controller
public class ProjectShopTeamController {
	
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	
	/**
	 * ��ȡ��Ŀ�г�ҳ��
	 */
	@RequestMapping("/team/projectShop")
	public String getProjectShopPage(HttpServletRequest request){
		List<IssusdProject> issusdProjectList=issusdProjectServiceImpl.selectIssusdProject(null);
		request.setAttribute("issusdProjectList", issusdProjectList);
		return "behind/company/team-projectMarket";
	}
}
