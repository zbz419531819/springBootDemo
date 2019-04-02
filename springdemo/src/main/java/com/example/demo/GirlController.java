package com.example.demo;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
	
	@Autowired
	private GirlRepository girlRepository;
	
	@Autowired
	private GirlService girlService;
	
	/*
	    * 查询所有女生列表
	 */
	@GetMapping(value = "/girls")
	public List<Girl> girlList(){
		return girlRepository.findAll();
	}
	
	/*
	 * 增加一个女生
	 */
	@PostMapping(value = "/girls")
	public Girl girlAdd(@RequestParam("cupSize") String cupSize,
			@RequestParam("age") Integer age) {
		Girl girl = new Girl();
		girl.setCupSize(cupSize);
		girl.setAge(age);
		return girlRepository.save(girl);
	}
	/**
	 * 根据id查询女生
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/girls/{id}")
	public Girl getGirl(@PathVariable("id") Integer id) {
		return girlRepository.findOne(id);
	}
	
	@PutMapping(value = "/girls/{id}")
	public Girl girlUpdate(@PathVariable("id") Integer id,
			@RequestParam("cupSize") String cupSize,
			@RequestParam("age") Integer age) {
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setCupSize(cupSize);
		girl.setId(id);
		return girlRepository.save(girl);
	}
	
	
	/**
	 * 删除
	 * @param id
	 */
	@DeleteMapping(value = "/girls/{id}")
	public void girlUpdate(@PathVariable("id") Integer id) {
		girlRepository.delete(id);
	}
	
	/**
	 * 通过年龄查询
	 * @param id
	 */
	@GetMapping(value = "/girls/age/{age}")
	public Girl girlForAge(@PathVariable("age") Integer age) {
		return girlRepository.findByAge(age);
	}
	
	/**
	 * 通过年龄查询
	 * @param id
	 */
	@GetMapping(value = "/girls/all")
	public void girlAll() {
		girlService.insertTwo();
	}
}