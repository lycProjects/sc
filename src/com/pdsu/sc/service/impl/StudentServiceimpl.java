package com.pdsu.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.pdsu.sc.mapper.StudentMapper;
import com.pdsu.sc.po.Absence;
import com.pdsu.sc.po.Page;
import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.StudentExample;
import com.pdsu.sc.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> selectByExample(StudentExample example){
		
		return studentMapper.selectByExample(example);
	}
	
/*	public List<Student> findStudent(@Param(value="startPos") Integer startPos,
	            @Param(value="pageSize") Integer pageSize,int st_team){
		System.out.println("serviceImpl"+st_team);
		return studentMapper.findStudent(startPos,pageSize,st_team);
		
	}*/
	
	
	@Override
	public List<Student> queryStudentAll() throws Exception {
		return studentMapper.queryStudentAll();
	}

	@Override
	public void deleteByPrimaryKey(Integer stId) throws Exception {
		studentMapper.deleteByPrimaryKey(stId);
	}

	@Override
	public void insert(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception {
		Student student=new Student();
		student.setStId(stId);
		student.setStTeam(stTeam);
		student.setStNumber(stNumber);
		student.setStName(stName);
		student.setStSex(stSex);
		student.setStClass(stClass);
		student.setStPhone(stPhone);
		student.setStIdcard(stIdcard);
		student.setStTeacher(stTeacher);
		System.err.println(student);
		studentMapper.insert(student);
	}

	@Override
	public List<Student> queryTeamStudentAll(String tmmName) throws Exception {
		return studentMapper.queryTeamStudentAll(tmmName);
	}
	
	public long getTeamCount(int st_team) {
		return studentMapper.getTeamCount(st_team);
	}
	
	public Student selectByPrimaryKey(Integer stId) {
		return studentMapper.selectByPrimaryKey(stId);
	}

	@Override
	public void findStudent(HttpServletRequest request,Model model,int st_team) {
		// TODO Auto-generated method stub
		 String pageNow = request.getParameter("pageNow"); 
	        
	        Page page = null; 
	       
	        List<Student> studentlist = new ArrayList<Student>(); 
	      
	        //查询用户总数
	        int totalCount = (int) studentMapper.getTeamCount(st_team);
	        System.out.println("--->"+totalCount);   
	        if (pageNow != null) {   
	            page = new Page(totalCount, Integer.parseInt(pageNow));  
	            System.out.println(page.getStartPos()+"<"+page.getPageSize()+"<"+st_team);
	            studentlist=this.studentMapper.findStudent(page.getStartPos(), page.getPageSize(),st_team);
	        } else { 
	            page = new Page(totalCount, 1); 
	            studentlist=this.studentMapper.findStudent(page.getStartPos(), page.getPageSize(),st_team);
	        } 
	        for (Student student : studentlist) {
				//System.out.println(student.toStringStudent());
			} 
	        model.addAttribute("studentlist", studentlist); 
	        model.addAttribute("page", page);  
	}

	@Override
	public void updateByPrimaryKey(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception {
		Student student=new Student();
		student.setStId(stId);
		student.setStTeam(stTeam);
		student.setStNumber(stNumber);
		student.setStName(stName);
		student.setStSex(stSex);
		student.setStClass(stClass);
		student.setStPhone(stPhone);
		student.setStIdcard(stIdcard);
		student.setStTeacher(stTeacher);
		studentMapper.updateByPrimaryKeySelective(student);
	}


}
