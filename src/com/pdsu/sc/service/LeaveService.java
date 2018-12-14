package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Leave;

public interface LeaveService {
	//添加
	public void insert(String leName,Integer leTeam,Integer leTime) throws Exception;
	
	//列表查询
	public List<Leave> queryLeaveAll() throws Exception;
	
	//根据id删除
	public void deleteByPrimaryKey(Integer leId) throws Exception;
	
	//根据id修改
	public void updateByPrimaryKey(Integer leId,String leName,Integer leTime) throws Exception;

}
