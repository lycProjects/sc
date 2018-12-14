package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.sc.mapper.IssusdProjectMapper;
import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectExample;
import com.pdsu.sc.po.IssusdProjectKey;
import com.pdsu.sc.service.IssusdProjectService;
@Service
@Transactional
public class IssusdProjectServiceImpl implements IssusdProjectService {
	@Autowired
	private IssusdProjectMapper issusdProjectMapper;
	
	@Override
	public int addIssusdProject(IssusdProject issusdProject) {
		// TODO Auto-generated method stub
		return issusdProjectMapper.insert(issusdProject);
	}

	@Override
	public int removeIssusdProject(IssusdProjectKey key) {
		// TODO Auto-generated method stub
		return issusdProjectMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int modifyIssusdProject(IssusdProject issusdProject) {
		// TODO Auto-generated method stub
		return issusdProjectMapper.updateByPrimaryKeySelective(issusdProject);
	}

	@Override
	public List<IssusdProject> selectIssusdProject(IssusdProjectExample issusdProjectExample) {
		// TODO Auto-generated method stub
		return issusdProjectMapper.selectByExample(issusdProjectExample);
	}

	@Override
	public IssusdProject selectIssusdProjectByPrimaryKey(IssusdProjectKey key) {
		// TODO Auto-generated method stub
		return issusdProjectMapper.selectByPrimaryKey(key);
	}

	@Override
	public int deleteByExample(IssusdProjectExample example) {
		// TODO Auto-generated method stub
		return issusdProjectMapper.deleteByExample(example);
	}

}
