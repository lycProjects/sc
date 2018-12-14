package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Leave;

public interface LeaveService {
	//���
	public void insert(String leName,Integer leTeam,Integer leTime) throws Exception;
	
	//�б��ѯ
	public List<Leave> queryLeaveAll() throws Exception;
	
	//����idɾ��
	public void deleteByPrimaryKey(Integer leId) throws Exception;
	
	//����id�޸�
	public void updateByPrimaryKey(Integer leId,String leName,Integer leTime) throws Exception;

}
