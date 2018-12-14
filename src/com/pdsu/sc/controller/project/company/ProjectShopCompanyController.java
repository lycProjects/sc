package com.pdsu.sc.controller.project.company;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * ��Ŀ�г�
 * <br/>
 * ʹ���ߣ���˾��½��
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.service.ApplicationService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.impl.ArticleFileServiceImpl;
/**
 * ��Ŀ�г�
 */
@Controller
public class ProjectShopCompanyController {
	
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	
	/**
	 * ��ȡ��Ŀ�г�ҳ��
	 */
	@RequestMapping("/company/projectShop")
	public String getProjectShopPage(HttpServletRequest request){
		List<IssusdProject> issusdProjectList=issusdProjectServiceImpl.selectIssusdProject(null);
		request.setAttribute("issusdProjectList", issusdProjectList);
		return "behind/company/projectShop";
	}
	
}
