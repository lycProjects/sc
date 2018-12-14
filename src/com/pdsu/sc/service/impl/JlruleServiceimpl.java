package com.pdsu.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.sc.mapper.JlruleMapper;
import com.pdsu.sc.po.Jlrule;
import com.pdsu.sc.service.JlruleService;

@Service
public class JlruleServiceimpl implements JlruleService{

	@Autowired
	private JlruleMapper jlruleMapper;
	
	public void deleteByPrimaryKey(Integer jlId) throws Exception {
		jlruleMapper.deleteByPrimaryKey(jlId);	
	}

	public void updateByPrimaryKeySelective(Integer jlId, String jlRecode,Date jlTime) throws Exception {
	     Jlrule jlrule=new Jlrule();
	     jlrule.setJlId(jlId);
	     jlrule.setJlRecode(jlRecode);
	     jlrule.setJlTime(jlTime);
	     jlruleMapper.updateByPrimaryKeySelective(jlrule);
	}

	public List<Jlrule> queryJlruleAll() throws Exception {
		return jlruleMapper.queryJlruleAll();
	}
	
	public void insertSelective(Jlrule record) {
		jlruleMapper.insertSelective(record);
	}

	@Override
	public List<Jlrule> queryJlruleByTeam(Integer jlTeam) throws Exception {
		return jlruleMapper.queryJlruleByTeam(jlTeam);
	}

}
