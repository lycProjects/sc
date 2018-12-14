package com.pdsu.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.TeammappingService1;

@Service
public class TeammappingServiceimpl1 implements TeammappingService1 {

	
	@Autowired
	private TeammappingMapper teammappingMapper; 
	
	@Override
	public List<Teammapping> queryallTeam() throws Exception {
		return teammappingMapper.queryallTeam();
	}

}
