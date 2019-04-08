package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Girl;
import com.example.properties.GirlRepository;

@Service
public class GirlService {
	
	@Autowired
	private GirlRepository girlRepository;
	
	@Transactional
	public void insertTwo() {
		Girl girlA = new Girl();
		girlA.setAge(1);
		girlA.setCupSize("A");
		girlRepository.save(girlA);
		
		
		Girl girlB = new Girl();
		girlB.setAge(111);
		girlB.setCupSize("FFF");
		girlRepository.save(girlB);
	}
}
