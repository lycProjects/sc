package com.pdsu.sc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.ApplicationExample;

public interface ApplicationService {
	/**
	 * ����������ѯ����
	 */
	public long countByExample(ApplicationExample example);
	/**
	 * �����Ŀ�����
	 */
	public int addApplication(Application application);
	/**
	 * ɾ����Ŀ�����
	 */
	public int removeApplication(Integer apId);
	/**
	 * ɾ����Ŀ���� ͨ������
	 */
	public int deleteByExample(ApplicationExample example);
	/**
	 * �޸���Ŀ�����
	 */
	public int modifyApplication(Application application);
	/**
	 * �Զ����޸���Ŀ����
	 */
	public int modifyByExampleSelective(Application application,ApplicationExample applicationExample);
	/**
	 * ��ѯ��Ŀ����
	 */
	public List<Application> selectApplication(ApplicationExample applicationExample);
	/**
	 * ͨ��id��ѯ��Ŀ����
	 */
	public Application selectApplicationByPrimaryKey(Integer apId);
}
