package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.WsruleMapper;
import com.pdsu.sc.po.Wsrule;
import com.pdsu.sc.service.WsruleService;
@Service
public class WsruleServiceImpl implements WsruleService{
	@Autowired
	private WsruleMapper wsruleMapper;
	 
	public Wsrule selectByPrimaryKey(Integer wsId) {
		 
		 return wsruleMapper.selectByPrimaryKey(wsId);
	}
	 
    public List<Wsrule> selectWsAll() {
		return wsruleMapper.selectAll();
	}
    
    public void updateByPrimaryKey(Wsrule record) {
    	wsruleMapper.updateByPrimaryKey(record);
    }
    
    public void updateByPrimaryKeySelective(Wsrule record) {
    	wsruleMapper.updateByPrimaryKeySelective(record);
    }
    
    public void deleteByPrimaryKey(Integer wsId) {
    	wsruleMapper.deleteByPrimaryKey(wsId);
    }
    
    public void addWsrule(Wsrule record) {
    	//System.out.println(record.toStringteam());
    	wsruleMapper.insertSelective(record);
    }


	@Override
	public String insert(Wsrule record) {
		// TODO Auto-generated method stub
		return null;
	}
}
