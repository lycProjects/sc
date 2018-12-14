package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Demo;
import com.pdsu.sc.po.DemoExample;

public interface DemoService {
	/**
	 * ���Demo
	 */
	public int addDemo(Demo demo);
	/**
	 * ɾ��Demo
	 */
	public int removeDemo(Integer deId);
	/**
	 * �޸�Demo
	 */
	public int modifyDemo(Demo demo);
	/**
	 * ��ѯDemo
	 */
	public List<Demo> selectDemo(DemoExample demoExample);
	/**
	 * ͨ��id��ѯDemo
	 */
	public Demo selectDemoByPrimaryKey(Integer deId);
}
