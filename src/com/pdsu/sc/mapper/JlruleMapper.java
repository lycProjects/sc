package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Jlrule;
import com.pdsu.sc.po.JlruleExample;
import com.pdsu.sc.po.Teammapping;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JlruleMapper {
    long countByExample(JlruleExample example);

    int deleteByExample(JlruleExample example);

    int deleteByPrimaryKey(Integer jlId);

    int insert(Jlrule record);

    int insertSelective(Jlrule record);

    List<Jlrule> selectByExample(JlruleExample example);

    Jlrule selectByPrimaryKey(Integer jlId);

    int updateByExampleSelective(@Param("record") Jlrule record, @Param("example") JlruleExample example);

    int updateByExample(@Param("record") Jlrule record, @Param("example") JlruleExample example);

    int updateByPrimaryKeySelective(Jlrule record);

    int updateByPrimaryKey(Jlrule record);
    
    //¡–±Ì≤È—Ø
    List<Jlrule> queryJlruleAll();
    
    List<Jlrule> queryJlruleByTeam(Integer jlTeam);
}