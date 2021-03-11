package com.webuilder.work.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.webuilder.work.domain.TestItem;

@Repository
public interface DBTestMapper {
	
	public List<TestItem> getAll() throws Exception;
	public int deleteAll() throws Exception;
	
	public int insertData() throws Exception;
	
	public int deleteData() throws Exception;
	
	public int updateData() throws Exception;
	
	public int totalCount() throws Exception;
	
	
}
