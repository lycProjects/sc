package com.pdsu.sc.service;

import java.util.Date;
import java.util.List;

import com.pdsu.sc.po.Jlrule;

public interface JlruleService {
	
	//����idɾ��
	public void deleteByPrimaryKey(Integer jlId) throws Exception;
	
	//�޸ļ�¼
	public void updateByPrimaryKeySelective(Integer jlId,String jlRecode,Date jlTime) throws Exception;
    
	//�б��ѯ
	public List<Jlrule> queryJlruleAll() throws Exception;
	
	//���
	public void insertSelective(Jlrule record);
	
	public List<Jlrule> queryJlruleByTeam(Integer jlTeam) throws Exception;
	
}
