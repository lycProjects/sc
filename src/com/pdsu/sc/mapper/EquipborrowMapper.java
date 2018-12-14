package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.po.EquipborrowExample;
import com.pdsu.sc.po.Teammapping;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipborrowMapper {
    long countByExample(EquipborrowExample example);

    int deleteByExample(EquipborrowExample example);

    int deleteByPrimaryKey(Integer eqbId);

    int insert(Equipborrow record);

    int insertSelective(Equipborrow record);

    List<Equipborrow> selectByExample(EquipborrowExample example);

    Equipborrow selectByPrimaryKey(Integer eqbId);

    int updateByExampleSelective(@Param("record") Equipborrow record, @Param("example") EquipborrowExample example);

    int updateByExample(@Param("record") Equipborrow record, @Param("example") EquipborrowExample example);

    int updateByPrimaryKeySelective(Equipborrow record);

    int updateByPrimaryKey(Equipborrow record);
    
    List<Equipborrow> queryAll();
}