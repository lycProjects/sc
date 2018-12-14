package com.pdsu.sc.mapper;

import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectExample;
import com.pdsu.sc.po.IssusdProjectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssusdProjectMapper {
    long countByExample(IssusdProjectExample example);

    int deleteByExample(IssusdProjectExample example);

    int deleteByPrimaryKey(IssusdProjectKey key);

    int insert(IssusdProject record);

    int insertSelective(IssusdProject record);

    List<IssusdProject> selectByExample(IssusdProjectExample example);

    IssusdProject selectByPrimaryKey(IssusdProjectKey key);

    int updateByExampleSelective(@Param("record") IssusdProject record, @Param("example") IssusdProjectExample example);

    int updateByExample(@Param("record") IssusdProject record, @Param("example") IssusdProjectExample example);

    int updateByPrimaryKeySelective(IssusdProject record);

    int updateByPrimaryKey(IssusdProject record);
}