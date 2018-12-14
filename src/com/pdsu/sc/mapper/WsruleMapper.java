package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Wsrule;
import com.pdsu.sc.po.WsruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsruleMapper {
    long countByExample(WsruleExample example);

    int deleteByExample(WsruleExample example);

    int deleteByPrimaryKey(Integer wsId);

    int insert(Wsrule record);

    int insertSelective(Wsrule record);

    List<Wsrule> selectByExample(WsruleExample example);

    Wsrule selectByPrimaryKey(Integer wsId);
    //²éÑ¯È«²¿
    public List<Wsrule> selectAll();
    
    int updateByExampleSelective(@Param("record") Wsrule record, @Param("example") WsruleExample example);

    int updateByExample(@Param("record") Wsrule record, @Param("example") WsruleExample example);

    int updateByPrimaryKeySelective(Wsrule record);

    int updateByPrimaryKey(Wsrule record);
}