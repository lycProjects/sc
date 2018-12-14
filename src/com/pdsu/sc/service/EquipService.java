package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.EquipExample;

public interface EquipService {
	
	//根据id设备
	public  Equip selectByPrimaryKey(Integer id) throws Exception;
	
	//根据id删除设备
	void deleteByPrimaryKey(Integer id) throws Exception;
	
	//修改数据
	void updateByPrimaryKeySelective(Integer id,Integer eqAmout,String eqNote)throws Exception;
	
	//添加数据
	void insert(String eqName,String eqUnit,Integer eqAmout,String eqNote) throws Exception;
	
	//列表查询
	public List<Equip> queryEquipAll() throws Exception;
	
	 //批量删除
    public void delUserById(int[] ids) throws Exception;

}
