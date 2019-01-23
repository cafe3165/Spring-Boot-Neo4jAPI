package com.appleyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appleyk.Repository.CatReponsitory;
import com.appleyk.nodeentity.Cat;
import com.appleyk.nodeentity.Coder;
import com.appleyk.service.catService;
import com.appleyk.service.coderService;

@RestController
public class CoderController {
	
	@Autowired
	private CatReponsitory catReposity;
	
	@RequestMapping("/test3")
	 public String index() { 
      return "Hello World 888";
  }
	
	@RequestMapping("/creatCoder")
	public void creatC() {
		Coder c=new Coder(); 
		coderService.createCoder(c);
	
	}
	@RequestMapping("/creatCat")
	public void creatCat() {
		Cat c=new Cat(); 
//		catService.createCat(c);
		c=catReposity.save(c);
	
	}
}
