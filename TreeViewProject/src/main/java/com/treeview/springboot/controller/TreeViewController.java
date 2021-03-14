package com.treeview.springboot.controller;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treeview.springboot.domain.TreeItem;
import com.treeview.springboot.mapper.TreeViewMapper;

@RestController
public class TreeViewController {
	@Autowired
	TreeViewMapper mapper;
	
	@Autowired
	SqlSessionFactory sqlFactory;
	
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
	
	@GetMapping("/getAll")
	public List<TreeItem> test() throws Exception {
		System.out.println(new Date() + " getAll 호출됨");
		List<TreeItem> item = mapper.getAll();
		System.out.println(new Date() + " getAll end");
		return item;
		
		
	}
	
	@GetMapping("/valueById")
	public String getName() throws Exception {
		return mapper.valueById(1L);
	}
}
