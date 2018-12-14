package com.pdsu.sc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.StudentService;
import com.pdsu.sc.service.TeammappingService1;

@Controller
public class TeamController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeammappingService1 teammappingService1; 
	
	@RequestMapping("/shuangchuangchengyuan")
	public String shuangchuangchengyuan(Model model) throws Exception{
		List<Student> studentList=studentService.queryStudentAll();
		model.addAttribute("studentList",studentList);
		return "behind/shuangchuangchengyuan";
	}
	
	@RequestMapping("/teamfenbiao")
	public String teamfenbiao(Model model,HttpServletRequest request) throws Exception{
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		String name=request.getParameter("teUnit");
		System.out.println(name);
		return "behind/teamfenbiao";
	}
	
	@RequestMapping(value="/adaptteam",method=RequestMethod.POST)
	public String adapt(HttpServletRequest request,Model model) throws Exception{
		String name=request.getParameter("teUnit");
		System.out.println(name);
		List<Student> studentList=studentService.queryTeamStudentAll(name);
		model.addAttribute("studentList",studentList);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/teamfenbiao"; 
	}


}
