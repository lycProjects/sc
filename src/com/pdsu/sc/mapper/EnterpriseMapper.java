package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Enterprise;
import com.pdsu.sc.po.EnterpriseExample;
import com.pdsu.sc.po.EnterpriseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseMapper {
    long countByExample(EnterpriseExample example);

    int deleteByExample(EnterpriseExample example);

    int deleteByPrimaryKey(EnterpriseKey key);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExample(EnterpriseExample example);

    Enterprise selectByPrimaryKey(EnterpriseKey key);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}