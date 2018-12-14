package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.LoginMapper;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.service.LoginService;

@Service
public class LoginServiceimpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public Login loginbackground(Login login) throws Exception {
		return loginMapper.loginbackground(login);
	}

	@Override
	public List<Login> queryLoginAll() throws Exception {
		return loginMapper.queryLoginAll();
	}

}
