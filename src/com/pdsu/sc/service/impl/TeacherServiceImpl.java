package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.TeacherMapper;
import com.pdsu.sc.po.Teacher;
import com.pdsu.sc.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;
	public void insert(String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception {
		Teacher teacher=new Teacher();
		teacher.setTeName(teName);
		teacher.setTeUnit(teUnit);
		teacher.setTePhone(tePhone);
		teacher.setTePosition(tePosition);
		teacher.setTeIdcard(teIdcard);
		teacherMapper.insert(teacher);
	}
	
	public void deleteByPrimaryKey(Integer teId) throws Exception {
		teacherMapper.deleteByPrimaryKey(teId);	
	}
	
	public Teacher selectByPrimaryKey(Integer teId) {
		
		return teacherMapper.selectByPrimaryKey(teId);
		
	}
	
//	public void updateByPrimaryKeySelective(Teacher record) {
//		teacherMapper.updateByPrimaryKeySelective(record);
//	}

	@Override
	public List<Teacher> queryAllTeacher() throws Exception {
		return teacherMapper.queryAllTeacher();
	}

	@Override
	public void updateByPrimaryKey(Integer teId,String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception {
		Teacher teacher=new Teacher();
		teacher.setTeId(teId);
		teacher.setTeName(teName);
		teacher.setTeUnit(teUnit);
		teacher.setTePhone(tePhone);
		teacher.setTePosition(tePosition);
		teacher.setTeIdcard(teIdcard);
		teacherMapper.updateByPrimaryKey(teacher);
	}
	
}
