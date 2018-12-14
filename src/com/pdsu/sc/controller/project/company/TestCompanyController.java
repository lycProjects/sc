package com.pdsu.sc.controller.project.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestCompanyController {
	
	@RequestMapping("/company/company-project")
	public String  companyproject() throws Exception {
		return "behind/company/company-project";
	}
	
	@RequestMapping("/company/company-projectList")
	public String companylistproject() throws Exception{
	     return "behind/company/company-projectList";	
	}
	
	//�鿴��Ŀ����
	@RequestMapping("/company/team-projectDescription")
	public String teamprojectDescription() throws Exception{
		return "behind/company/team-projectDescription";
	}
	
	//��Ŀ���
	@RequestMapping("/company/team-projectMarket")
	public String companyteamProjectMarket() throws Exception{
		return "behind/company/team-projectMarket";
	}
	
	//��Ŀ����
	@RequestMapping("/company/team-projectApply")
	public String teamprojectApply() throws Exception{
		return "behind/company/team-projectApply";
	}

}
