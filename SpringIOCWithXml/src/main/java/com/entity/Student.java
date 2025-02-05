package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	// pojo  class 
	@Value("1")
	private int std_id;
	@Value("riya")
	private String std_name;
	@Value("29")
	private int age;
	
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", age=" + age + "]";
	}
	public Student(int std_id, String std_name, int age) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
