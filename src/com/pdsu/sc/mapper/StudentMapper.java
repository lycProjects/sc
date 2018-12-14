package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> findStudent(@Param("startPos") Integer startPos,@Param("pageSize") Integer pageSize,@Param("st_team") int st_team);
    
    public long getTeamCount(int st_team);
    
    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer stId);
    
    Student selectByName(String name);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    //学生列表查询
    List<Student> queryStudentAll();
    
    //根据团队名查询
    List<Student> queryTeamStudentAll(String tmmName);
}