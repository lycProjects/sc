package com.pdsu.sc.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.StudentExample;

public interface StudentService {
	//学生查询列表
	public List<Student> queryStudentAll() throws Exception;
	
	//考勤查询
	public void findStudent(HttpServletRequest request,Model model,int st_team);
	 
	public long getTeamCount(int st_team);
	 
	public Student selectByPrimaryKey(Integer stId);
	
	//根据团队名查询
	public List<Student> queryTeamStudentAll(String tmmName) throws Exception;
	
	//根据id删除
	public void deleteByPrimaryKey(Integer stId) throws Exception;
	
	//插入学生数据
	public void insert(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception;
	
	public List<Student> selectByExample(StudentExample example) throws Exception;
	
	//更新
	public void updateByPrimaryKey(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception;

}
