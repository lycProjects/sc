package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectExample;
import com.pdsu.sc.po.IssusdProjectKey;

public interface IssusdProjectService {
	/**
	 * 添加下达项目
	 */
	public int addIssusdProject(IssusdProject issusdProject);
	/**
	 * 删除下达项目
	 */
	public int removeIssusdProject(IssusdProjectKey key);
	/**
	 * 删除下达项目 通过条件
	 */
	public int deleteByExample(IssusdProjectExample example);
	/**
	 * 修改下达项目
	 */
	public int modifyIssusdProject(IssusdProject issusdProject);
	/**
	 * 查询下达项目
	 */
	public List<IssusdProject> selectIssusdProject(IssusdProjectExample issusdProjectExample);
	/**
	 * 通过id查询下达项目
	 */
	public IssusdProject selectIssusdProjectByPrimaryKey(IssusdProjectKey key);
}
