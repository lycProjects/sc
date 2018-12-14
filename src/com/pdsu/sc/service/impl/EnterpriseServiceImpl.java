package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.sc.mapper.EnterpriseMapper;
import com.pdsu.sc.po.Enterprise;
import com.pdsu.sc.po.EnterpriseExample;
import com.pdsu.sc.po.EnterpriseKey;
import com.pdsu.sc.service.EnterpriseService;
@Service
@Transactional
public class EnterpriseServiceImpl implements EnterpriseService {

	@Autowired
	private EnterpriseMapper enterpriseMapper;
	
	@Override
	public int addEnterprise(Enterprise Enterprise) {
		// TODO Auto-generated method stub
		return enterpriseMapper.insert(Enterprise);
	}

	@Override
	public int removeEnterprise(EnterpriseKey key) {
		// TODO Auto-generated method stub
		return enterpriseMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int modifyEnterprise(Enterprise enterprise) {
		// TODO Auto-generated method stub
		return enterpriseMapper.updateByPrimaryKeySelective(enterprise);
	}

	@Override
	public List<Enterprise> selectEnterprise(EnterpriseExample enterpriseExample) {
		// TODO Auto-generated method stub
		return enterpriseMapper.selectByExample(enterpriseExample);
	}

	@Override
	public Enterprise selectEnterpriseByPrimaryKey(EnterpriseKey key) {
		// TODO Auto-generated method stub
		return enterpriseMapper.selectByPrimaryKey(key);
	}

}
