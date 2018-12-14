package com.pdsu.sc.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pdsu.sc.po.Teacher;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.TeacherService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TeammappingService1;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;

	@Autowired
	private TeammappingService1 teammappingService1;
	
	@RequestMapping("/adapt-teacher")
	public String queryAllTeachers(Model model) throws Exception{
		List<Teacher> teacherList=teacherService.queryAllTeacher();
		model.addAttribute("teacherList", teacherList);
		return "behind/adapt-teacher";
	}
	


	@RequestMapping("/deleteByPrimaryKey")
	public String deleteByPrimaryKey(Teacher teacher,Model model) throws Exception{
		Integer teId=teacher.getTeId();  
		teacherService.deleteByPrimaryKey(teId);
		List<Teacher> teacherList=teacherService.queryAllTeacher();
		model.addAttribute("teacherList", teacherList);
		return "behind/adapt-teacher";
	 }



	@RequestMapping("/adapt-teacher-add")
	public String adaptteacheradd(Model model) throws Exception{
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam();
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/adapt-teacher-add";
	}
	
	@RequestMapping(value="/teacheradd",method=RequestMethod.POST)
	public String teacheradd(Teacher teacher,Model model) throws Exception{
		String teName=teacher.getTeName();
		String teUnit=teacher.getTeUnit();
		String tePhone=teacher.getTePhone();
		String tePosition=teacher.getTePosition();
		String teIdcard=teacher.getTeIdcard();
		teacherService.insert(teName, teUnit, tePhone, tePosition, teIdcard);
		List<Teacher> teacherList=teacherService.queryAllTeacher();
		model.addAttribute("teacherList", teacherList);
		return "behind/adapt-teacher";
	}
	
	@RequestMapping(value="/updateteacher/{teId}")
	public String updateteacher(@PathVariable("teId")Integer teId,HttpServletRequest request,Model model) throws Exception{
		System.out.println(teId);
		Teacher teacher1=teacherService.selectByPrimaryKey(teId);
		System.out.println(teacher1);
		model.addAttribute("teacher1", teacher1);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/updateteacher";
	}
	
	@RequestMapping("/teacheredit")
	public String teacheredit(Model model,Integer teId,String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception{
		teacherService.updateByPrimaryKey(teId, teName, teUnit, tePhone, tePosition, teIdcard);
		List<Teacher> teacherList=teacherService.queryAllTeacher();
		model.addAttribute("teacherList", teacherList);
		return "behind/adapt-teacher";
	}
	

}
