package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.EquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipMapper {
    long countByExample(EquipExample example);

    int deleteByExample(EquipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Equip record);

    int insertSelective(Equip record);

    List<Equip> selectByExample(EquipExample example);

    Equip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByExample(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);
    
    List<Equip> queryEquipAll();
    
    //ÅúÁ¿É¾³ý
    public int delUserById(int[] id);
}