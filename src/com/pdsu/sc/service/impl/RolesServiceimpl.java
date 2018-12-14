package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.RolesMapper;
import com.pdsu.sc.po.Roles;
import com.pdsu.sc.service.RolesService;

@Service
public class RolesServiceimpl implements RolesService {

	@Autowired
	private RolesMapper rolesMapper;
	
	@Override
	public List<Roles> queryall() throws Exception {
		return rolesMapper.queryall();
	}

}
