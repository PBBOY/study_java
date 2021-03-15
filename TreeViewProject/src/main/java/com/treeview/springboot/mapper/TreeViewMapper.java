package com.treeview.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.treeview.springboot.domain.TreeItem;

@Mapper
@Repository
public interface TreeViewMapper {
	List<TreeItem> getAll() throws Exception;
	
	String valueById(Long id) throws Exception;
	
	List<TreeItem> getTreeAll() throws Exception;
	int insertData(TreeItem item) throws Exception;
	int deleteData(Long id) throws Exception;
	
}
