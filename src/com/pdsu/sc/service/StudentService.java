package com.pdsu.sc.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.StudentExample;

public interface StudentService {
	//ѧ����ѯ�б�
	public List<Student> queryStudentAll() throws Exception;
	
	//���ڲ�ѯ
	public void findStudent(HttpServletRequest request,Model model,int st_team);
	 
	public long getTeamCount(int st_team);
	 
	public Student selectByPrimaryKey(Integer stId);
	
	//�����Ŷ�����ѯ
	public List<Student> queryTeamStudentAll(String tmmName) throws Exception;
	
	//����idɾ��
	public void deleteByPrimaryKey(Integer stId) throws Exception;
	
	//����ѧ������
	public void insert(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception;
	
	public List<Student> selectByExample(StudentExample example) throws Exception;
	
	//����
	public void updateByPrimaryKey(Integer stId,Integer stTeam,Integer stNumber,String stName,String stSex,String stClass,String stPhone,String stIdcard,String stTeacher) throws Exception;

}
