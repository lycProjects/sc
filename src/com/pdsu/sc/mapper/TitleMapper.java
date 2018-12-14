package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitleMapper {
    long countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(Integer tiId);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(Integer tiId);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}