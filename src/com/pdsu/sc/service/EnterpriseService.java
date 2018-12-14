package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Enterprise;
import com.pdsu.sc.po.EnterpriseExample;
import com.pdsu.sc.po.EnterpriseKey;

public interface EnterpriseService {
	/**
	 * 添加企业
	 */
	public int addEnterprise(Enterprise Enterprise);
	/**
	 * 删除企业
	 */
	public int removeEnterprise(EnterpriseKey key);
	/**
	 * 修改企业
	 */
	public int modifyEnterprise(Enterprise enterprise);
	/**
	 * 查询企业
	 */
	public List<Enterprise> selectEnterprise(EnterpriseExample enterpriseExample);
	/**
	 * 通过id查询企业
	 */
	public Enterprise selectEnterpriseByPrimaryKey(EnterpriseKey key);
}
