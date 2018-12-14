package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.sc.mapper.TitleMapper;
import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;
import com.pdsu.sc.service.TitleService;
@Service
@Transactional
public class TitleServiceImpl implements TitleService {
	@Autowired
	private TitleMapper titleMapper;
	@Override
	public int addTitle(Title title) {
		// TODO Auto-generated method stub
		return titleMapper.insert(title);
	}

	@Override
	public int removeTitle(Integer tiId) {
		// TODO Auto-generated method stub
		return titleMapper.deleteByPrimaryKey(tiId);
	}

	@Override
	public int modifyTitle(Title title) {
		// TODO Auto-generated method stub
		return titleMapper.updateByPrimaryKeySelective(title);
	}

	@Override
	public List<Title> selectTitle(TitleExample titleExample) {
		// TODO Auto-generated method stub
		return titleMapper.selectByExample(titleExample);
	}

	@Override
	public Title selectTitleByPrimaryKey(Integer tiId) {
		// TODO Auto-generated method stub
		return titleMapper.selectByPrimaryKey(tiId);
	}

}
