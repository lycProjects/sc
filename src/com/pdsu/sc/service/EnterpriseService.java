package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Enterprise;
import com.pdsu.sc.po.EnterpriseExample;
import com.pdsu.sc.po.EnterpriseKey;

public interface EnterpriseService {
	/**
	 * �����ҵ
	 */
	public int addEnterprise(Enterprise Enterprise);
	/**
	 * ɾ����ҵ
	 */
	public int removeEnterprise(EnterpriseKey key);
	/**
	 * �޸���ҵ
	 */
	public int modifyEnterprise(Enterprise enterprise);
	/**
	 * ��ѯ��ҵ
	 */
	public List<Enterprise> selectEnterprise(EnterpriseExample enterpriseExample);
	/**
	 * ͨ��id��ѯ��ҵ
	 */
	public Enterprise selectEnterpriseByPrimaryKey(EnterpriseKey key);
}
