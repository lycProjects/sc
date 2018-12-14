package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.EquipborrowMapper;
import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.EquipborrowService;

/**
* @ClassName: EquipborrowServiceimpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 李勇超
* @date 2018年8月29日下午3:32:14
*
*/
@Service
public class EquipborrowServiceimpl implements EquipborrowService {

	@Autowired
	private EquipborrowMapper equipborrowMapper;
	
	@Override
	public void updateByPrimaryKey(Integer id,Integer eqbTeam,Integer eqbZfour,Integer eqbOneg,Integer eqbTwog,Integer eqbFourg) throws Exception {
		Equipborrow equipborrow=new Equipborrow();
		equipborrow.setEqbId(id);
		equipborrow.setEqbTeam(eqbTeam);
		equipborrow.setEqbZfour(eqbZfour);
		equipborrow.setEqbOneg(eqbOneg);
		equipborrow.setEqbTwog(eqbTwog);
		equipborrow.setEqbFourg(eqbFourg);
		equipborrowMapper.updateByPrimaryKey(equipborrow);	
	}

	@Override
	public void deleteByPrimaryKey(Integer id) throws Exception {
		equipborrowMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(Integer eqbTeam, Integer eqbZfour, Integer eqbOneg, Integer eqbTwog,
			Integer eqbFourg) throws Exception {
		Equipborrow equipborrow=new Equipborrow();
		equipborrow.setEqbTeam(eqbTeam);
		equipborrow.setEqbZfour(eqbZfour);
		equipborrow.setEqbOneg(eqbOneg);
		equipborrow.setEqbTwog(eqbTwog);
		equipborrow.setEqbFourg(eqbFourg);
		equipborrowMapper.insert(equipborrow);
	}

	@Override
	public List<Equipborrow> queryAll() throws Exception {
		return equipborrowMapper.queryAll();
	}

	@Override
	public void delEquipById(int[] ids) throws Exception {
		for(int i=0;i<ids.length;i++)
		{
		   equipborrowMapper.deleteByPrimaryKey(ids[i]);
		}
	}

	@Override
	public Equipborrow selectByPrimaryKey(Integer eqbId) throws Exception {
		return equipborrowMapper.selectByPrimaryKey(eqbId);
	}


	

}
