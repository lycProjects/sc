package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Wsrule;

public interface WsruleService {
	//ͨ������������ѯ
	 Wsrule selectByPrimaryKey(Integer wsId);
	 
    //��ѯȫ��
   // public Wsrule selectAll();
	 
	public void addWsrule(Wsrule record);
    
    public List<Wsrule> selectWsAll();
    
    public void updateByPrimaryKey(Wsrule record);
    
    public String insert(Wsrule record);
    
    public void updateByPrimaryKeySelective(Wsrule record);
    
    public void deleteByPrimaryKey(Integer wsId);

}
