package com.treeview.springboot.controller;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treeview.springboot.domain.TreeItem;
import com.treeview.springboot.mapper.TreeViewMapper;
import com.treeview.springboot.service.TreeViewService;

@RestController
public class TreeViewController {
	
	@Autowired
	SqlSessionFactory sqlFactory;
	
	@Autowired
	private TreeViewService service;
	
	@GetMapping("/test")
	public String sqlCehck() throws Exception{
		try {

			SqlSession session = sqlFactory.openSession();
			System.out.println("성공 : " + session);
				
		} catch (Exception ex){
			System.out.println("실패..!");
			ex.printStackTrace();
		}
		return "/board/list";
	}

	
	@GetMapping("/valueById")
	public String valueById(Long id) throws Exception {
		return service.valueById(id);
	}
	
	@GetMapping("/getAll")
	public List<TreeItem> getAll() throws Exception {
		return service.getAll();
	}
	
	@GetMapping("/getTreeAll")
	public List<TreeItem> getTreeAll() throws Exception {
		System.out.println("start");
		return service.getTreeAll();
	}
	
	@PostMapping("/insertData")
	public int insertData(TreeItem item) throws Exception {
		return service.insertData(item);
	}
	
	@DeleteMapping("/deleteData")
	public int deleteData(Long id) throws Exception{
		return service.deleteData(id);
	}
}
