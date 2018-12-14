package com.pdsu.sc.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.TeammappingExample;

public interface TeammappingService {
	
   	public long getTeammappingCount();
	public void showTeammappingByPage(HttpServletRequest request,Model model);
	
	public int insert(Teammapping record);
	
    public List<Teammapping> selectByExample(TeammappingExample example);

    public Teammapping selectByPrimaryKey(Integer tmmId);
}
