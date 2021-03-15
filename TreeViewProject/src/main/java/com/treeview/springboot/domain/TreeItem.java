package com.treeview.springboot.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TreeItem{
	private Long id;
	private Integer[] path;
	
	private String content;
	
	private Long age;
	private String userName;
	
}
