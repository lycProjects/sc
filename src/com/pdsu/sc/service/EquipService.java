package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.EquipExample;

public interface EquipService {
	
	//����id�豸
	public  Equip selectByPrimaryKey(Integer id) throws Exception;
	
	//����idɾ���豸
	void deleteByPrimaryKey(Integer id) throws Exception;
	
	//�޸�����
	void updateByPrimaryKeySelective(Integer id,Integer eqAmout,String eqNote)throws Exception;
	
	//�������
	void insert(String eqName,String eqUnit,Integer eqAmout,String eqNote) throws Exception;
	
	//�б��ѯ
	public List<Equip> queryEquipAll() throws Exception;
	
	 //����ɾ��
    public void delUserById(int[] ids) throws Exception;

}
