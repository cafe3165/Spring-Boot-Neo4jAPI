package com.appleyk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appleyk.Repository.CatReponsitory;
import com.appleyk.nodeentity.Cat;


@Service
//@Transactional

public class catService {
	@Autowired
	private static CatReponsitory catRepository;
	
	public static Cat createCat(Cat c) {
		return catRepository.save(c);
	}
}