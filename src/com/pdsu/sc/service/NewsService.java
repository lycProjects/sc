package com.pdsu.sc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pdsu.sc.po.NewsCategory;
import com.pdsu.sc.po.NewsCategoryExample;
import com.pdsu.sc.po.NewsNew;
import com.pdsu.sc.po.NewsNewExample;

public interface NewsService {
	/**
	 * ����������
	 */
	public int addNewsCategory(NewsCategory newsCategory);
	
	/**
	 * ɾ���������
	 */
	public int removeNewsCategory(Integer newscateId);
	
	/**
	 * �޸��������
	 */
	public int modifyNewsCategory(NewsCategory newsCategory);
	
	/**
	 * ��ѯ�������
	 */
	public List<NewsCategory> selectNewsCategory(NewsCategoryExample newsCategoryExample);
	
	/**
	 * ��ѯ�������
	 */
	public NewsCategory selectNewsCategoryByPrimaryKey(Integer newscateId);
	
	/**
	 * ��ѯ�������������
	 */
	public Long selectAllNewsCategoryCount();
	
	//**********************************************************���Žӿ�
	
	/**
	 * �������
	 */
	public int addNewsNew(NewsNew newsNew);
	
	/**
	 * ɾ������
	 */
	public int removeNewsNew(Integer newsnewId);
	
	/**
	 * �޸�����
	 */
	public int modifyNewsNew(NewsNew newsNew);
	
	/**
	 * ��ѯ����
	 */
	public List<NewsNew> selectNewsNew(NewsNewExample newsNewExample);
	
	/**
	 * ��ѯ����
	 */
	public NewsNew selectNewsNewByPrimaryKey(Integer newsnewId);
	
	/**
	 * ��ѯ����������
	 */
	public Long selectAllNewsNewCount();
}
