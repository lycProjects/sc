package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {
    long countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int deleteByPrimaryKey(Integer apId);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    Application selectByPrimaryKey(Integer apId);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}