package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Demo;
import com.pdsu.sc.po.DemoExample;

public interface DemoService {
	/**
	 * 添加Demo
	 */
	public int addDemo(Demo demo);
	/**
	 * 删除Demo
	 */
	public int removeDemo(Integer deId);
	/**
	 * 修改Demo
	 */
	public int modifyDemo(Demo demo);
	/**
	 * 查询Demo
	 */
	public List<Demo> selectDemo(DemoExample demoExample);
	/**
	 * 通过id查询Demo
	 */
	public Demo selectDemoByPrimaryKey(Integer deId);
}
