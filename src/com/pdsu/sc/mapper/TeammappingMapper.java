package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.TeammappingExample;
import com.pdsu.sc.po.TeammappingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeammappingMapper {
    long countByExample(TeammappingExample example);

    int deleteByExample(TeammappingExample example);

    int deleteByPrimaryKey(Integer tmmId);

    int insert(Teammapping record);

    int insertSelective(Teammapping record);
    
    List<Teammapping> selectByExample(TeammappingExample example);

    Teammapping selectByPrimaryKey(Integer tmmId);

    int updateByExampleSelective(@Param("record") Teammapping record, @Param("example") TeammappingExample example);

    int updateByExample(@Param("record") Teammapping record, @Param("example") TeammappingExample example);

    int updateByPrimaryKeySelective(Teammapping record);

    int updateByPrimaryKey(Teammapping record);
    

    //²éÑ¯×ÜÊý
    public long getTeammappingCount();
    
    public List<Teammapping> selectTeammappingByPage(@Param(value="startPos") Integer startPos,
            @Param(value="pageSize") Integer pageSize);
    
    List<Teammapping> queryallTeam();
}