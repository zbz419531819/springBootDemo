package com.example.properties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Girl;

public interface GirlRepository extends JpaRepository<Girl, Integer>{

	public Girl findByAge(Integer age);
}
