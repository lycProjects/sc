package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Teacher;

public interface TeacherService {
	//插入
	public void insert(String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception;
    //删除
    public void deleteByPrimaryKey(Integer teId) throws Exception;
    //查找
    public Teacher selectByPrimaryKey(Integer teId);
    //按条件进行更新
//   public void  updateByPrimaryKeySelective(Teacher record);
   
    //列表查询
    public List<Teacher> queryAllTeacher() throws Exception;
    
    //修改
    public void updateByPrimaryKey(Integer teId,String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception;
    
}
