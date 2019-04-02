package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer>{

	public Girl findByAge(Integer age);
}
