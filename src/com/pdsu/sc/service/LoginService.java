package com.pdsu.sc.service;

import java.util.List;

import com.pdsu.sc.po.Login;

public interface LoginService {

	//��̨��¼
	public  Login loginbackground(Login login) throws Exception;
	
	public List<Login> queryLoginAll() throws Exception;
	
}
