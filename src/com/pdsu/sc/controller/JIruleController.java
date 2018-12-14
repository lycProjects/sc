package com.pdsu.sc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.po.Jlrule;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Wsrule;
import com.pdsu.sc.service.JlruleService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.impl.JlruleServiceimpl;
import com.pdsu.sc.service.impl.TeammappingServiceImpl;
@Controller
public class JIruleController {
	@Autowired
	private TeammappingService teammappingService;
	
	@Autowired
	private JlruleService jlruleService;
	
	@RequestMapping("/rulepage")
	public String showTeam(HttpServletRequest request,Model model) throws HTTPException,IOException{
		teammappingService.showTeammappingByPage(request, model);
		return "behind/jilvjiancha";
	}   
	@RequestMapping(value="/discipline_insert",method=RequestMethod.POST)
	@ResponseBody
	public String jlTeam(Jlrule jlrule) throws IOException{
		jlruleService.insertSelective(jlrule);
		return "OK";
	}
	
	
	@RequestMapping("/weijihuizongbiao")
	public String weijihuizongbiao(Model model) throws Exception{
		
		List<Jlrule> JlruleList=jlruleService.queryJlruleAll();
		model.addAttribute("JlruleList",JlruleList);
		return "behind/weijihuizongbiao";
	}
	
	@RequestMapping("/weijihuizongbiao2")
	public String weijihuizongbiao2(Model model,HttpSession httpSession) throws Exception{
		Integer loteam=((Login)httpSession.getAttribute("userData")).getLoTeam();
		List<Jlrule> JlruleList=jlruleService.queryJlruleByTeam(loteam);
		model.addAttribute("JlruleList",JlruleList);
		return "behind/weijihuizongbiao";
		
	}
	
}
