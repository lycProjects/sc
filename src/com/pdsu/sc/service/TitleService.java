package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;

public interface TitleService {
	/**
	 * �������
	 */
	public int addTitle(Title title);
	/**
	 * ɾ������
	 */
	public int removeTitle(Integer tiId);
	/**
	 * �޸�����
	 */
	public int modifyTitle(Title title);
	/**
	 * ��ѯ����
	 */
	public List<Title> selectTitle(TitleExample titleExample);
	/**
	 * ͨ��id��ѯ����
	 */
	public Title selectTitleByPrimaryKey(Integer tiId);
}
