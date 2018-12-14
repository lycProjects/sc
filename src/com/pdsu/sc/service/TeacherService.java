package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Teacher;

public interface TeacherService {
	//����
	public void insert(String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception;
    //ɾ��
    public void deleteByPrimaryKey(Integer teId) throws Exception;
    //����
    public Teacher selectByPrimaryKey(Integer teId);
    //���������и���
//   public void  updateByPrimaryKeySelective(Teacher record);
   
    //�б��ѯ
    public List<Teacher> queryAllTeacher() throws Exception;
    
    //�޸�
    public void updateByPrimaryKey(Integer teId,String teName,String teUnit,String tePhone,String tePosition,String teIdcard) throws Exception;
    
}
