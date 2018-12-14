package com.pdsu.sc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.ApplicationExample;

public interface ApplicationService {
	/**
	 * 根据条件查询数量
	 */
	public long countByExample(ApplicationExample example);
	/**
	 * 添加项目申请表
	 */
	public int addApplication(Application application);
	/**
	 * 删除项目申请表
	 */
	public int removeApplication(Integer apId);
	/**
	 * 删除项目申请 通过条件
	 */
	public int deleteByExample(ApplicationExample example);
	/**
	 * 修改项目申请表
	 */
	public int modifyApplication(Application application);
	/**
	 * 自定义修改项目申请
	 */
	public int modifyByExampleSelective(Application application,ApplicationExample applicationExample);
	/**
	 * 查询项目申请
	 */
	public List<Application> selectApplication(ApplicationExample applicationExample);
	/**
	 * 通过id查询项目申请
	 */
	public Application selectApplicationByPrimaryKey(Integer apId);
}
