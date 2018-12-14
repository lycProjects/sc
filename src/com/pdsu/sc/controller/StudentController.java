package com.pdsu.sc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.StudentExample;
import com.pdsu.sc.po.Teacher;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.StudentService;
import com.pdsu.sc.service.TeacherService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TeammappingService1;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeammappingService1 teammappingService1; 
	
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/adapt-player")
	public String adaptplayer(Model model,HttpServletRequest request) throws Exception{
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		String name=request.getParameter("teUnit");
		System.out.println(name);
		return "behind/adapt-player";
	}
	
	
	@RequestMapping(value="/adapt-player1")
	public String adaptplayer1(Model model,HttpServletRequest request,HttpSession httpSession) throws Exception{
		Integer loteam=((Login)httpSession.getAttribute("userData")).getLoTeam();
		StudentExample example=new StudentExample();
		StudentExample.Criteria criteria= example.createCriteria();
		criteria.andStTeamEqualTo(loteam);	
		List<Student> studentlist=studentService.selectByExample(example);
		model.addAttribute("studentlist", studentlist);
		return "behind/adapt-player2";
	}
	
	
	@RequestMapping(value="/adapt-player2")
	public String adaptplayer2(Model model,HttpServletRequest request,HttpSession httpSession) throws Exception{
		Integer loteam=((Login)httpSession.getAttribute("userData")).getLoTeam();
		StudentExample example=new StudentExample();
		StudentExample.Criteria criteria= example.createCriteria();
		criteria.andStTeamEqualTo(loteam);	
		List<Student> studentlist=studentService.selectByExample(example);
		model.addAttribute("studentlist", studentlist);
		return "behind/adapt-player2";
	}
	
	@RequestMapping(value="/adapt",method=RequestMethod.POST)
	public String adapt(HttpServletRequest request,Model model) throws Exception{
		String name=request.getParameter("teUnit");
		System.out.println(name);
		List<Student> studentList=studentService.queryTeamStudentAll(name);
		model.addAttribute("studentList",studentList);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/adapt-player"; 
	}
	
	@RequestMapping("/adapt-player-add")
	public String adaptplayeradd(Model model) throws Exception{
		
		List<Teacher> teacherList=teacherService.queryAllTeacher();
		model.addAttribute("teacherList",teacherList);
		
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/adapt-player-add";
	}
	
	@RequestMapping(value="/adaptadds",method=RequestMethod.POST)
	public String adaptadds(Model model,Integer stTeam,Integer stNumber,String stSex,String stIdcard,String stPhone,String stClass,String stName,HttpServletResponse response,String stTeacher,HttpServletRequest request) throws Exception{
		/*String stSex=request.getParameter("stSex");
		String stIdcard=request.getParameter("stIdcard");
		String stPhone=request.getParameter("stPhone");
		String stClass=request.getParameter("stClass");
		String stName=request.getParameter("stName"); 
		String stTeacher=request.getParameter("stTeacher");*/
		System.out.println(stTeacher);
		studentService.insert(null,stTeam, stNumber, stName, stSex, stClass, stPhone, stIdcard, stTeacher);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/adapt-player";
	}
	
	
	@RequestMapping("/playerdelete/{stId}")
	public String playerdelete(@PathVariable("stId")Integer stId,Model model) throws Exception{
		studentService.deleteByPrimaryKey(stId);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/adapt-player";
	}
	
	
	@RequestMapping("/adapt-player-edit/{stId}")
	public String adaptplayeredit(@PathVariable("stId")Integer stId,Model model) throws Exception{
		Student student=studentService.selectByPrimaryKey(stId);
		model.addAttribute("student", student);
		return "behind/adapt-player-edit";
	}
	
	@RequestMapping(value="/studentedit",method=RequestMethod.POST)
	public String studentedit(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception{
		studentService.updateByPrimaryKey(stId, stTeam, stNumber, stName, stSex, stClass, stPhone, stIdcard,null);
		return "behind/adapt-player";
	}
	

}
