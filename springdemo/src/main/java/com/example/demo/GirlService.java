package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
