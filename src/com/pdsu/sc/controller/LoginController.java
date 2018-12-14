package com.pdsu.sc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import net.sf.json.JSONObject;
import test.loginTest;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Roles;
import com.pdsu.sc.service.LoginService;
import com.pdsu.sc.service.RolesService;
import com.sun.xml.internal.bind.v2.model.core.ID;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RolesService rolesService;
	
	@RequestMapping("/login")
	public String loginTest(Model model) throws Exception{
		List<Roles> rolesList=rolesService.queryall();
		model.addAttribute("rolesList", rolesList);
		return "behind/login";
	}
	

	@RequestMapping(value="/loginin",method=RequestMethod.POST)
	public String loginin(Login login,HttpServletRequest request,HttpSession httpSession) throws Exception{
		Integer role=login.getLoRole();
		String name=login.getLoUsername();
		String password=login.getLoPassword();
		Integer loTeam=login.getLoTeam();
		Login result=loginService.loginbackground(login);
		httpSession.setAttribute("userData", result);
		if(role==1)
		{
			if (name.equals(result.getLoUsername())&&password.equals(result.getLoPassword())) {
	            return "behind/index";
		    }else {
		    	return "behind/404";
		    }
		}
        if(role==2){
			if (name.equals(result.getLoUsername())&&password.equals(result.getLoPassword())) {
	            return "behind/index1";
		    }
		}
        if(role==3)
        {
        	if (name.equals(result.getLoUsername())&&password.equals(result.getLoPassword())) {
	            return "behind/index2";
		    }
        }
        if(role==4)
        {
        	if (name.equals(result.getLoUsername())&&password.equals(result.getLoPassword())) {
	            return "behind/index2";
		    }
        }
		
		return "behind/404";
	
	}
}
