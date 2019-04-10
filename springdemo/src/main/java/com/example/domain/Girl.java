package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Girl {

	@Id
	@GeneratedValue
	private int id;
	private String cupSize;
	@Min(value=1,message="未成年喔~")
	private int age;
	
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Girl [id=" + id + ", cupSize=" + cupSize + ", age=" + age + "]";
	}
	
}
