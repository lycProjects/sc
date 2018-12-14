package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.po.Teammapping;

public interface EquipborrowService {
	//�޸�
	void updateByPrimaryKey(Integer id,Integer eqbTeam,Integer eqbZfour,Integer eqbOneg,Integer eqbTwog,Integer eqbFourg) throws Exception;
	
	//ɾ��
	void deleteByPrimaryKey(Integer id) throws Exception;
	
	//���
	void insert(Integer eqbTeam,Integer eqbZfour,Integer eqbOneg,Integer eqbTwog,Integer eqbFourg) throws Exception;
	
	//�б��ѯ
	List<Equipborrow> queryAll() throws Exception;
	
	//����ɾ��
    public void delEquipById(int[] ids) throws Exception;
    
    //ͨ��id��ѯ
    public Equipborrow selectByPrimaryKey(Integer eqbId) throws Exception;
    
	
	
}
