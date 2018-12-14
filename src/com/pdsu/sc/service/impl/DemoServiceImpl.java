package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.sc.mapper.DemoMapper;
import com.pdsu.sc.po.Demo;
import com.pdsu.sc.po.DemoExample;
import com.pdsu.sc.service.DemoService;
@Service
@Transactional
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	@Override
	public int addDemo(Demo demo) {
		// TODO Auto-generated method stub
		return demoMapper.insert(demo);
	}

	@Override
	public int removeDemo(Integer deId) {
		// TODO Auto-generated method stub
		return demoMapper.deleteByPrimaryKey(deId);
	}

	@Override
	public int modifyDemo(Demo demo) {
		// TODO Auto-generated method stub
		return demoMapper.updateByPrimaryKeySelective(demo);
	}

	@Override
	public List<Demo> selectDemo(DemoExample demoExample) {
		// TODO Auto-generated method stub
		return demoMapper.selectByExample(demoExample);
	}

	@Override
	public Demo selectDemoByPrimaryKey(Integer deId) {
		// TODO Auto-generated method stub
		return demoMapper.selectByPrimaryKey(deId);
	}

}
