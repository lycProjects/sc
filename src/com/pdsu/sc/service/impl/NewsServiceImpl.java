package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.NewsCategoryMapper;
import com.pdsu.sc.mapper.NewsNewMapper;
import com.pdsu.sc.po.NewsCategory;
import com.pdsu.sc.po.NewsCategoryExample;
import com.pdsu.sc.po.NewsNew;
import com.pdsu.sc.po.NewsNewExample;
import com.pdsu.sc.service.NewsService;

@Service("newsServiceImpl")
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsCategoryMapper newsCategoryMapper;
	
	@Autowired
	private NewsNewMapper newsNewMapper;
	
	@Override
	public int addNewsCategory(NewsCategory newsCategory) {
		return newsCategoryMapper.insert(newsCategory);
	}

	@Override
	public int removeNewsCategory(Integer newscateId) {
		return newsCategoryMapper.deleteByPrimaryKey(newscateId);
	}

	@Override
	public int modifyNewsCategory(NewsCategory newsCategory) {
		return newsCategoryMapper.updateByPrimaryKeySelective(newsCategory);
	}

	@Override
	public List<NewsCategory> selectNewsCategory(NewsCategoryExample newsCategoryExample) {
		// TODO Auto-generated method stub
		return newsCategoryMapper.selectByExample(newsCategoryExample);
	}

	@Override
	public Long selectAllNewsCategoryCount() {
		return newsCategoryMapper.countByExample(null);
	}

	@Override
	public int addNewsNew(NewsNew newsNew) {
		return newsNewMapper.insert(newsNew);
	}

	@Override
	public int removeNewsNew(Integer newsnewId) {
		return newsNewMapper.deleteByPrimaryKey(newsnewId);
	}

	@Override
	public int modifyNewsNew(NewsNew newsNew) {
		return newsNewMapper.updateByPrimaryKeySelective(newsNew);
	}

	@Override
	public List<NewsNew> selectNewsNew(NewsNewExample newsNewExample) {
		// TODO Auto-generated method stub
		return newsNewMapper.selectByExample(newsNewExample);
	}

	@Override
	public Long selectAllNewsNewCount() {
		// TODO Auto-generated method stub
		return newsNewMapper.countByExample(null);
	}

	@Override
	public NewsCategory selectNewsCategoryByPrimaryKey(Integer newscateId) {
		return newsCategoryMapper.selectByPrimaryKey(newscateId);
	}

	@Override
	public NewsNew selectNewsNewByPrimaryKey(Integer newsnewId) {
		return newsNewMapper.selectByPrimaryKey(newsnewId);
	}

}
