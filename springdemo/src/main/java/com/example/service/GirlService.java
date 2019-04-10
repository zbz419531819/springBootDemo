package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Girl;
import com.example.enums.ResultEnum;
import com.example.exception.GirlException;
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
	
	 public void getAge(Integer id) {
	        Girl girl = girlRepository.findOne(id);
	        Integer age = girl.getAge();
	        if (age < 10) {
	            //返回"你还在上小学吧" code=100
	            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
	        }else if (age > 10 && age < 16) {
	            //返回"你可能在上初中" code=101
	            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
	        }

	        //如果>16岁,加钱
	        //...
	    }
}
