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
	//查询所有
	public List<Absence> selectAll() throws  Exception;
	
	public Absence selectByPrimaryKey(Integer abId) throws  Exception;
	
	//获取查询总数（用于计算页数）
	public long getAbsenceCount() throws  Exception;
	
    //批量删除
	public void deleteMany(int[] id_arr) throws  Exception;
    
    //删除
    public void deleteByPrimaryKey(Integer abId) throws  Exception;
    
    //查寻所有并分页
    public void showAbsenceByPage(HttpServletRequest request,Model model) throws  Exception;

    
    public Absence selectByName(String name) throws  Exception;
    
    public List<Absence> selectByExample(AbsenceExample example) throws  Exception;
    
    public void updateByName(String name) throws  Exception;

    
    public List<Absence> queryAbsenceByTeam(Integer abTeam) throws Exception;
    
}
