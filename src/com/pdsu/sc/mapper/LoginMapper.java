package com.pdsu.sc.mapper;

import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.LoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    long countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(Integer loId);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(Integer loId);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
    
    
    //ºóÌ¨µÇÂ¼
    Login loginbackground(Login login);
    
    List<Login> queryLoginAll();
}