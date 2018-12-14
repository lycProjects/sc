package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;

public interface TitleService {
	/**
	 * 添加文章
	 */
	public int addTitle(Title title);
	/**
	 * 删除文章
	 */
	public int removeTitle(Integer tiId);
	/**
	 * 修改文章
	 */
	public int modifyTitle(Title title);
	/**
	 * 查询文章
	 */
	public List<Title> selectTitle(TitleExample titleExample);
	/**
	 * 通过id查询文章
	 */
	public Title selectTitleByPrimaryKey(Integer tiId);
}
