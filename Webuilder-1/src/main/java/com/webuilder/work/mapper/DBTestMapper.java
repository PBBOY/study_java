package com.webuilder.work.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.webuilder.work.domain.TestItem;

@Repository
public interface DBTestMapper {
	public List<TestItem> getAll() throws Exception;
}
