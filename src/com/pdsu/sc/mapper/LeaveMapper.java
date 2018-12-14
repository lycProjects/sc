package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Leave;
import com.pdsu.sc.po.LeaveExample;
import com.pdsu.sc.po.Teammapping;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMapper {
    long countByExample(LeaveExample example);

    int deleteByExample(LeaveExample example);

    int deleteByPrimaryKey(Integer leId);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExample(LeaveExample example);

    Leave selectByPrimaryKey(Integer leId);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
    
    //¡–±Ì≤È—Ø
    List<Leave> queryLeaveAll();
}