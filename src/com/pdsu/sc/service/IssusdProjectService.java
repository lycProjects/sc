package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectExample;
import com.pdsu.sc.po.IssusdProjectKey;

public interface IssusdProjectService {
	/**
	 * ����´���Ŀ
	 */
	public int addIssusdProject(IssusdProject issusdProject);
	/**
	 * ɾ���´���Ŀ
	 */
	public int removeIssusdProject(IssusdProjectKey key);
	/**
	 * ɾ���´���Ŀ ͨ������
	 */
	public int deleteByExample(IssusdProjectExample example);
	/**
	 * �޸��´���Ŀ
	 */
	public int modifyIssusdProject(IssusdProject issusdProject);
	/**
	 * ��ѯ�´���Ŀ
	 */
	public List<IssusdProject> selectIssusdProject(IssusdProjectExample issusdProjectExample);
	/**
	 * ͨ��id��ѯ�´���Ŀ
	 */
	public IssusdProject selectIssusdProjectByPrimaryKey(IssusdProjectKey key);
}
