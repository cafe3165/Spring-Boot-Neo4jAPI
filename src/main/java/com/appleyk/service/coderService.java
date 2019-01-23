package com.appleyk.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.appleyk.Repository.CoderRepository;
import com.appleyk.nodeentity.Coder;
import org.springframework.stereotype.Service;

@Service
//@Transactional

public class coderService {
	@Autowired
	private static CoderRepository coderRepository;
	
	public static Coder createCoder(Coder c) {
		return coderRepository.save(c);
	}
}
