package com.pdsu.sc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pdsu.sc.po.NewsCategory;
import com.pdsu.sc.po.NewsCategoryExample;
import com.pdsu.sc.po.NewsNew;
import com.pdsu.sc.po.NewsNewExample;

public interface NewsService {
	/**
	 * 添加新闻类别
	 */
	public int addNewsCategory(NewsCategory newsCategory);
	
	/**
	 * 删除新闻类别
	 */
	public int removeNewsCategory(Integer newscateId);
	
	/**
	 * 修改新闻类别
	 */
	public int modifyNewsCategory(NewsCategory newsCategory);
	
	/**
	 * 查询新闻类别
	 */
	public List<NewsCategory> selectNewsCategory(NewsCategoryExample newsCategoryExample);
	
	/**
	 * 查询新闻类别
	 */
	public NewsCategory selectNewsCategoryByPrimaryKey(Integer newscateId);
	
	/**
	 * 查询新闻类别总数量
	 */
	public Long selectAllNewsCategoryCount();
	
	//**********************************************************新闻接口
	
	/**
	 * 添加新闻
	 */
	public int addNewsNew(NewsNew newsNew);
	
	/**
	 * 删除新闻
	 */
	public int removeNewsNew(Integer newsnewId);
	
	/**
	 * 修改新闻
	 */
	public int modifyNewsNew(NewsNew newsNew);
	
	/**
	 * 查询新闻
	 */
	public List<NewsNew> selectNewsNew(NewsNewExample newsNewExample);
	
	/**
	 * 查询新闻
	 */
	public NewsNew selectNewsNewByPrimaryKey(Integer newsnewId);
	
	/**
	 * 查询新闻总数量
	 */
	public Long selectAllNewsNewCount();
}
