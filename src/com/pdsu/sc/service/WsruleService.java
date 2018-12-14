package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Wsrule;

public interface WsruleService {
	//通过主键单个查询
	 Wsrule selectByPrimaryKey(Integer wsId);
	 
    //查询全部
   // public Wsrule selectAll();
	 
	public void addWsrule(Wsrule record);
    
    public List<Wsrule> selectWsAll();
    
    public void updateByPrimaryKey(Wsrule record);
    
    public String insert(Wsrule record);
    
    public void updateByPrimaryKeySelective(Wsrule record);
    
    public void deleteByPrimaryKey(Integer wsId);

}
