package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Summary;
import com.pdsu.sc.po.SummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SummaryMapper {
    long countByExample(SummaryExample example);

    int deleteByExample(SummaryExample example);

    int deleteByPrimaryKey(Integer suId);

    int insert(Summary record);

    int insertSelective(Summary record);

    List<Summary> selectByExample(SummaryExample example);

    Summary selectByPrimaryKey(Integer suId);

    int updateByExampleSelective(@Param("record") Summary record, @Param("example") SummaryExample example);

    int updateByExample(@Param("record") Summary record, @Param("example") SummaryExample example);

    int updateByPrimaryKeySelective(Summary record);

    int updateByPrimaryKey(Summary record);
}