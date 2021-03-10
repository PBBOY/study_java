package com.webuilder.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webuilder.work.domain.TestItem;
import com.webuilder.work.mapper.DBTestMapper;

@Service
public class DBTestService {
	
	@Autowired
	DBTestMapper testMapper;
	
	public List<TestItem> getAll() throws Exception {
		return testMapper.getAll();
	}
	
	
}
