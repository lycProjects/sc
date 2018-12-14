package com.pdsu.sc.mapper;

import com.pdsu.sc.po.NewsNew;
import com.pdsu.sc.po.NewsNewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsNewMapper {
    long countByExample(NewsNewExample example);

    int deleteByExample(NewsNewExample example);

    int deleteByPrimaryKey(Integer newsnewId);

    int insert(NewsNew record);

    int insertSelective(NewsNew record);

    List<NewsNew> selectByExample(NewsNewExample example);

    NewsNew selectByPrimaryKey(Integer newsnewId);

    int updateByExampleSelective(@Param("record") NewsNew record, @Param("example") NewsNewExample example);

    int updateByExample(@Param("record") NewsNew record, @Param("example") NewsNewExample example);

    int updateByPrimaryKeySelective(NewsNew record);

    int updateByPrimaryKey(NewsNew record);
}