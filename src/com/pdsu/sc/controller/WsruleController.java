package com.pdsu.sc.controller;


import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.Wsrule;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.WsruleService;
import com.pdsu.sc.service.impl.TeammappingServiceImpl;
import com.pdsu.sc.service.impl.WsruleServiceImpl;

@Controller
public class WsruleController {
	@Autowired
	private WsruleService wsruleService;
	
	
	@Autowired
	private TeammappingService teammappingService;
	//卫生检查
	@RequestMapping("/cleanpage")
	public String showTeam(HttpServletRequest request,Model model) throws HTTPException,IOException{
		//System.out.println(request.getRequestURL());
		//System.out.println(request.getQueryString());    
		teammappingService.showTeammappingByPage(request, model);
		return "behind/weisheng";
	}
	
	@RequestMapping(value="/clean_insert",method=RequestMethod.POST)
	@ResponseBody
	public String wsTeam(Wsrule wsrule) throws IOException{
		System.out.println(wsrule);
		wsruleService.addWsrule(wsrule);
		return "OK";
	}
	@RequestMapping(value="/infalse")
	public String insertWsrule(HttpServletRequest request,HttpServletResponse response) throws HTTPException,IOException{
		String wi=request.getParameter("teamName");
		System.out.println("11111111111");
		System.out.println(wi);
		String wt=request.getParameter("wsTeam");
		Integer t=Integer.valueOf(wt);
		String wr=request.getParameter("wsRecode");
		Wsrule wsrule=new Wsrule(null, t, wr, new Date());
		wsruleService.addWsrule(wsrule);
		return "behind/weisheng";
	}
	
	
	//单个查询
	@RequestMapping("/queryws/{id}")
	public String ShowWsrule(@PathVariable("id") Integer wsId,Map<String,Object> map)  throws IOException{
		Wsrule wsrule=wsruleService.selectByPrimaryKey(wsId);
		System.out.println("卫生："+wsrule);
		map.put("wsrule", wsrule);
		return "test/wstest";
	}
	
	//查询所有
	@RequestMapping("/queryall")
	public String showAllWsrule(Map<String,Object> map) throws IOException{
		List<Wsrule> wsrules=wsruleService.selectWsAll();
		map.put("wsrules", wsrules);
		for (Wsrule wsrule : wsrules) {
			System.out.println(wsrule.toStringtest());
		}
		return "test/wstest";
	}
	
	//添加
	@RequestMapping(value="/addWsrule")
	public String addWsrule() throws IOException{
		Wsrule wsrule=new Wsrule(null, 2, "地面不干净", new Date());
		wsruleService.addWsrule(wsrule);
		return "jsp/success";
		
	}
	
	//修改
	@RequestMapping("/updateWsrule")
	public String updateWsrule() throws IOException{
		Wsrule wsrule=new Wsrule(3, 2, "好哇好哇", new Date());
		wsruleService.updateByPrimaryKeySelective(wsrule);
		return "jsp/success";
	}
	
	
	//删除
	@RequestMapping("/deleteWsrule/{id}")
	public String deleteWsrule(@PathVariable("id") Integer wsId) {
		wsruleService.deleteByPrimaryKey(wsId);
		return "jsp/success";
	}
	
	
	@RequestMapping("/testindex.action")
	public String test() {
		return "jsp/index";
	}
	
	
	@RequestMapping("/jilv-add")
	public String jilvadd() throws Exception{
		return "behind/jilv-add";
	}
	

}
