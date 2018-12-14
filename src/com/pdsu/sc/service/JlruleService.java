package com.pdsu.sc.service;

import java.util.Date;
import java.util.List;

import com.pdsu.sc.po.Jlrule;

public interface JlruleService {
	
	//根据id删除
	public void deleteByPrimaryKey(Integer jlId) throws Exception;
	
	//修改记录
	public void updateByPrimaryKeySelective(Integer jlId,String jlRecode,Date jlTime) throws Exception;
    
	//列表查询
	public List<Jlrule> queryJlruleAll() throws Exception;
	
	//添加
	public void insertSelective(Jlrule record);
	
	public List<Jlrule> queryJlruleByTeam(Integer jlTeam) throws Exception;
	
}
