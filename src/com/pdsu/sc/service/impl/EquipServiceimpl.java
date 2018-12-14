package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.EquipMapper;
import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.EquipExample;
import com.pdsu.sc.service.EquipService;

@Service
public class EquipServiceimpl implements EquipService {
    
	@Autowired
	private EquipMapper equipMapper;
	

	@Override
	public Equip selectByPrimaryKey(Integer id) throws Exception {
		return equipMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteByPrimaryKey(Integer id) throws Exception {
		equipMapper.deleteByPrimaryKey(id);
	}

	
	@Override
	public void updateByPrimaryKeySelective(Integer id,Integer eqAmout,String eqNote) throws Exception {
		Equip equip=new Equip();
		equip.setId(id);
		equip.setEqAmout(eqAmout);
		equip.setEqNote(eqNote);
		equipMapper.updateByPrimaryKeySelective(equip);	
	}

	@Override
	public void insert(String eqName,String eqUnit,Integer eqAmout,String eqNote) throws Exception {
		Equip equip=new Equip();
		equip.setEqName(eqName);
		equip.setEqUnit(eqUnit);
		equip.setEqAmout(eqAmout);
		equip.setEqNote(eqNote);
		equipMapper.insert(equip);
	}

	@Override
	public List<Equip> queryEquipAll() throws Exception {
		return equipMapper.queryEquipAll();
	}

	@Override
	public void delUserById(int[] ids) throws Exception {
		for(int i=0;i<ids.length;i++)
		{
		   equipMapper.deleteByPrimaryKey(ids[i]);
		}
	}
}
