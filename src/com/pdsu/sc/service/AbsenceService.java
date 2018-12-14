package com.pdsu.sc.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.pdsu.sc.po.Absence;
import com.pdsu.sc.po.AbsenceExample;
import com.pdsu.sc.po.Student;

public interface AbsenceService {
	
	
	/*
	 *  private Integer abId;

    private String abName;

    private Integer abTeam;

    private Integer abTime;
	 */
	public void updateByPrimaryKeySelective(Absence record) throws  Exception;
	public void insert(String abName,Integer abTeam,Integer abTime) throws  Exception;
	//��ѯ����
	public List<Absence> selectAll() throws  Exception;
	
	public Absence selectByPrimaryKey(Integer abId) throws  Exception;
	
	//��ȡ��ѯ���������ڼ���ҳ����
	public long getAbsenceCount() throws  Exception;
	
    //����ɾ��
	public void deleteMany(int[] id_arr) throws  Exception;
    
    //ɾ��
    public void deleteByPrimaryKey(Integer abId) throws  Exception;
    
    //��Ѱ���в���ҳ
    public void showAbsenceByPage(HttpServletRequest request,Model model) throws  Exception;

    
    public Absence selectByName(String name) throws  Exception;
    
    public List<Absence> selectByExample(AbsenceExample example) throws  Exception;
    
    public void updateByName(String name) throws  Exception;

    
    public List<Absence> queryAbsenceByTeam(Integer abTeam) throws Exception;
    
}
