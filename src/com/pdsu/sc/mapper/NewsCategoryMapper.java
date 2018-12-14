package com.pdsu.sc.mapper;

import com.pdsu.sc.po.NewsCategory;
import com.pdsu.sc.po.NewsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsCategoryMapper {
    long countByExample(NewsCategoryExample example);

    int deleteByExample(NewsCategoryExample example);

    int deleteByPrimaryKey(Integer newscateId);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    List<NewsCategory> selectByExample(NewsCategoryExample example);

    NewsCategory selectByPrimaryKey(Integer newscateId);

    int updateByExampleSelective(@Param("record") NewsCategory record, @Param("example") NewsCategoryExample example);

    int updateByExample(@Param("record") NewsCategory record, @Param("example") NewsCategoryExample example);

    int updateByPrimaryKeySelective(NewsCategory record);

    int updateByPrimaryKey(NewsCategory record);
}