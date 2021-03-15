package com.treeview.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treeview.springboot.domain.TreeItem;
import com.treeview.springboot.mapper.TreeViewMapper;

@Service
public class TreeViewService {
	
	@Autowired
	private TreeViewMapper mapper;
	
	public List<TreeItem> getAll() throws Exception {
		return mapper.getAll();
	}
	
	public List<TreeItem> getTreeAll() throws Exception {
		return mapper.getTreeAll();
	}
	
	public String valueById(Long id) throws Exception {
		return mapper.valueById(id);
	}
	
	public int insertData(TreeItem item) throws Exception {
		return mapper.insertData(item);
	}
	
	public int deleteData(Long id) throws Exception {
		return mapper.deleteData(id);
	}
	
}
