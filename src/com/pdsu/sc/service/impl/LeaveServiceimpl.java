package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pdsu.sc.mapper.LeaveMapper;
import com.pdsu.sc.po.Leave;
import com.pdsu.sc.service.LeaveService;

public class LeaveServiceimpl implements LeaveService {

	@Autowired
	private LeaveMapper leaveMapper;
	
	@Override
	public void insert(String leName,Integer leTeam,Integer leTime) throws Exception {
		Leave leave=new Leave();
		leave.setLeName(leName);
		leave.setLeTeam(leTeam);
		leave.setLeTime(leTime);
		leaveMapper.insert(leave);
	}

	@Override
	public List<Leave> queryLeaveAll() throws Exception {
		return leaveMapper.queryLeaveAll();
	}

	@Override
	public void deleteByPrimaryKey(Integer leId) throws Exception {
		leaveMapper.deleteByPrimaryKey(leId);
	}

	@Override
	public void updateByPrimaryKey(Integer leId,String leName,Integer leTime) throws Exception {
		Leave leave=new Leave();
		leave.setLeId(leId);
		leave.setLeName(leName);
		leave.setLeTime(leTime);
		leaveMapper.updateByPrimaryKey(leave);
	}

	

}
