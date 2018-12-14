package com.pdsu.sc.controller;


import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.mapper.AbsenceMapper;
import com.pdsu.sc.po.Absence;
import com.pdsu.sc.po.Equipborrow;

import com.pdsu.sc.po.Login;

import com.pdsu.sc.po.Page;
import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.AbsenceService;
import com.pdsu.sc.service.StudentService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TeammappingService1;
import com.pdsu.sc.service.impl.AbsenceServiceImpl;
import com.pdsu.sc.service.impl.StudentServiceimpl;
import com.pdsu.sc.service.impl.TeammappingServiceImpl;


@Controller
public class AbsenceController {
	@Autowired
	private AbsenceService absenceService;
	@Autowired
	private TeammappingService teammappingService;
	@Autowired
	private TeammappingService1 teammappingService1;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/test")
	public String demo()  throws IOException{
		return "test/team";
	}
	
	//查询所有
	@RequestMapping(value="/showall")
	public String showall(Map<String,Object> map)  throws Exception{
	//	List<Absence> absences=absenceMapper.selectAll();
		List<Absence> absences=absenceService.selectAll();
		map.put("absences", absences);
		return "test/team";
	}
	
	
  //分页
    @RequestMapping(value="/page")
    public String pagingUser(HttpServletRequest request,Model model)throws Exception{
//    	absenceServiceImpl.showUserByPage(request, model);
    	absenceService.showAbsenceByPage(request, model);
        return "test/pageabsence";
         
    }
	    
  /*  @RequestMapping(value="/deleteMany")
    public String deleteMany(int[] chk_value) {
        System.out.println(chk_value);
        if (chk_value == null ) {
            return "redirect:/test/team";
        }
        //直接传数组
        absenceServiceImpl.deleteMany(chk_value);
        //重定向
        return "redirect:/test/pageabsence";
    }
    */
    @RequestMapping(value="/deleteAbsence/{id}")
    public String deleteAbsence(@PathVariable("id") Integer abId) throws Exception{
    	absenceService.deleteByPrimaryKey(abId);
    	return "jsp/success";
    }
    
    @RequestMapping(value="/addAbsence")
    public String addAbsence() throws Exception{
    	absenceService.insert("test", 1, 2);
    	return "jsp/success";
    }
    @RequestMapping(value="/updateAbsence/{id}")
    public String updateAbsence(@PathVariable("id") Integer abId) throws Exception{
    	Absence absence=new Absence(abId, "哈哈", 1, 1);
    	absenceService.updateByPrimaryKeySelective(absence);
    	return "jsp/success";
    }
    
 /*   @RequestMapping(value="/del")
    @ResponseBody
    public String delStansard(Integer[] d)throws IOException{ //传过来的是一个名叫d的数组
        try {
            //批量删除
            absenceService.deleteMany(d);
        } catch (Exception e) {
            // TODO: handle exception
            return "error";
        }
        return "ok";
    }*/
    @RequestMapping(value="absenceAdd/{id}")
    @ResponseBody
    public String findStudent(@PathVariable("id") int id)throws Exception{
    	System.out.println(id);
    	Student student=studentService.selectByPrimaryKey(id);
    	if(absenceService.selectByName(student.getStName())!=null) {
    		absenceService.updateByName(student.getStName());
    	}else {
    		absenceService.insert(student.getStName(), student.getStTeam(), 1);
    	}
    	return "ok";
    }
    
    @RequestMapping(value="/orderTeamName/{id}")        
    public String findStudent(HttpServletRequest request,Model model,@PathVariable("id") int st_team)throws HTTPException,IOException{

    	System.out.println(request.getRequestURL());    
    	System.out.println(request.getQueryString());
    	System.out.println("===>"+st_team);
    	studentService.findStudent(request, model, st_team);
    	return "behind/orderName2";     
         
    }
    
    @RequestMapping(value="/selectteam")
	public String absenceByTeam(Model model,HttpServletRequest request) throws Exception{
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		String name=request.getParameter("teUnit");
		System.out.println(name);
		return "behind/orderName";   
	}    
    

    @RequestMapping(value="/orderNames",method=RequestMethod.GET)
    public String absenceStudent(Model model,HttpServletRequest request) throws Exception{
    	String name=request.getParameter("teUnit");
    	System.out.println(name);   
    	List<Student> studentList=studentService.queryTeamStudentAll(name);
		model.addAttribute("studentList",studentList);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		for (Teammapping teammapping : teammappingMappersList) {
			System.out.println(teammapping);
		}
		model.addAttribute("teammappingMappersList", teammappingMappersList);
    	return "behind/orderName";
    }
    
    @RequestMapping(value="/teamOrderName",method=RequestMethod.POST)
    public String absenceTeamStudent(Model model,HttpServletRequest request) throws Exception{
    	String name=request.getParameter("teUnit");
    	System.out.println(name);   
    	List<Student> studentList=studentService.queryTeamStudentAll(name);
		model.addAttribute("studentList",studentList);
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam(); 
		for (Teammapping teammapping : teammappingMappersList) {
			System.out.println(teammapping);
		}
		model.addAttribute("teammappingMappersList", teammappingMappersList);
    	return "behind/orderName";
    }
    
    
    @RequestMapping("/absence")
    public String absence(Model model) throws Exception{
    	
    	List<Absence> absenceList=absenceService.selectAll();
    	model.addAttribute("absenceList",absenceList);
    	
    	return "behind/absence";
    }
    

    @RequestMapping(value="/addtest")    
    @ResponseBody
    public String delStansard(Integer[] d){ //传过来的是一个名叫d的数组
        try {
            //批量删除
        	for (int i = 0; i < d.length; i++) {
        		System.out.println(d[i]);
        		Student student=studentService.selectByPrimaryKey(d[i]);
            	if(absenceService.selectByName(student.getStName())!=null) {
            		absenceService.updateByName(student.getStName());
            	}else {
            		absenceService.insert(student.getStName(), student.getStTeam(), 1);
            	}
			}
        } catch (Exception e) {
            // TODO: handle exception
        	System.out.println(e);    
            return "error";
        }
        return "ok";
    }



    @RequestMapping("/absence2")
    public String absence2(Model model,HttpSession httpSession) throws Exception{
    	Integer abTeam=((Login)httpSession.getAttribute("userData")).getLoTeam();
    	List<Absence> absenceList=absenceService.queryAbsenceByTeam(abTeam);
    	model.addAttribute("absenceList",absenceList);
    	
    	return "behind/absence";
    }

}












