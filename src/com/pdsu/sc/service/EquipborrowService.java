package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.po.Teammapping;

public interface EquipborrowService {
	//修改
	void updateByPrimaryKey(Integer id,Integer eqbTeam,Integer eqbZfour,Integer eqbOneg,Integer eqbTwog,Integer eqbFourg) throws Exception;
	
	//删除
	void deleteByPrimaryKey(Integer id) throws Exception;
	
	//添加
	void insert(Integer eqbTeam,Integer eqbZfour,Integer eqbOneg,Integer eqbTwog,Integer eqbFourg) throws Exception;
	
	//列表查询
	List<Equipborrow> queryAll() throws Exception;
	
	//批量删除
    public void delEquipById(int[] ids) throws Exception;
    
    //通过id查询
    public Equipborrow selectByPrimaryKey(Integer eqbId) throws Exception;
    
	
	
}
