package com.webuilder.work.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webuilder.work.domain.TestItem;
import com.webuilder.work.service.DBTestService;

@RestController
public class mainController {
	@Autowired
	DBTestService testService;
	
	@GetMapping("/")
	public String welcome() {
		return "wellcom";
	}
	
	@GetMapping("/query")
	public List<TestItem> query() throws Exception{
		return testService.getAll();
	}
	
	@PutMapping("/insert")
	public int putData() throws Exception {
		return testService.insertData();
	}
	
	
	@DeleteMapping("/delete")
	public int deleteData() throws Exception {
		return testService.deleteData();
	}
	
	@DeleteMapping("/deleteAll")
	public int deleteAll() throws Exception {
		return testService.deleteAll();
	}
	
}
