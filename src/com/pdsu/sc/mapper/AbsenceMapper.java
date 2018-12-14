package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Absence;
import com.pdsu.sc.po.AbsenceExample;
import com.pdsu.sc.po.Student;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbsenceMapper {
	
	
//======================================================================================
    
	
    //查询所有
    public List<Absence> selectAll();
    
    //批量删除
    public void deleteMany(Integer[] id_arr);
    
    //查询总数
    public long getAbsenceCount();
    
    //查寻所有并分页
    public List<Absence> selectAbsenceByPage(@Param(value="startPos") Integer startPos,
            @Param(value="pageSize") Integer pageSize);
    
    
    
//=======================================================================================
    long countByExample(AbsenceExample example);

    int deleteByExample(AbsenceExample example);

    int deleteByPrimaryKey(Integer abId);

    int insert(Absence record);

    int insertSelective(Absence record);

    List<Absence> selectByExample(AbsenceExample example);

    Absence selectByPrimaryKey(Integer abId);
    
    Absence selectByName(String name);

    int updateByExampleSelective(@Param("record") Absence record, @Param("example") AbsenceExample example);

    int updateByExample(@Param("record") Absence record, @Param("example") AbsenceExample example);

    int updateByPrimaryKeySelective(Absence record);

    int updateByPrimaryKey(Absence record);

    
    void updateByName(String name);

    
    
    List<Absence> queryAbsenceByTeam(Integer abTeam);
    

}