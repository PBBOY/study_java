package com.webuilder.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webuilder.work.domain.TestItem;
import com.webuilder.work.mapper.DBTestMapper;

/**
 * @author parkman
 *
 */
@Service
public class DBTestService {
	
	@Autowired
	DBTestMapper testMapper;

	
	public int totalCount() throws Exception {
		return testMapper.totalCount();
	}
	
	/**
	 * Select ALL
	 * @return	List<TestItem>
	 * @throws Exception
	 */
	public List<TestItem> getAll() throws Exception {
		return testMapper.getAll();
	}
	
	
	/**
	 * DataInsert
	 * @return 1
	 * @throws Exception
	 */
	public int insertData() throws Exception {
		return testMapper.insertData();
	}
	
	
	/**
	 * DataDelete 
	 * @return 1
	 * @throws Exception
	 */
	public int deleteData() throws Exception {
		return testMapper.deleteData();
	}
	
	/**
	 * Delete All
	 * @return 1
	 * @throws Exception
	 */
	public int deleteAll() throws Exception {
		return testMapper.deleteAll();
	}
	

	
	
	
	
	
}
