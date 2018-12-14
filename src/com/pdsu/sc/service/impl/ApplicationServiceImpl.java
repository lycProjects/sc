package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.sc.mapper.ApplicationMapper;
import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.ApplicationExample;
import com.pdsu.sc.service.ApplicationService;
@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationMapper applicationMapper;
	
	@Override
	public int addApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationMapper.insert(application);
	}

	@Override
	public int removeApplication(Integer apId) {
		// TODO Auto-generated method stub
		return applicationMapper.deleteByPrimaryKey(apId);
	}

	@Override
	public int modifyApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationMapper.updateByPrimaryKeySelective(application);
	}

	@Override
	public List<Application> selectApplication(ApplicationExample applicationExample) {
		// TODO Auto-generated method stub
		return applicationMapper.selectByExample(applicationExample);
	}

	@Override
	public Application selectApplicationByPrimaryKey(Integer apId) {
		// TODO Auto-generated method stub
		return applicationMapper.selectByPrimaryKey(apId);
	}

	@Override
	public int deleteByExample(ApplicationExample example) {
		// TODO Auto-generated method stub
		return applicationMapper.deleteByExample(example);
	}

	@Override
	public int modifyByExampleSelective(Application record, ApplicationExample example) {
		// TODO Auto-generated method stub
		return applicationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public long countByExample(ApplicationExample example) {
		// TODO Auto-generated method stub
		return applicationMapper.countByExample(example);
	}

}
