package com.entity;

public class Student {
	
	private int std_id;
	private String std_name;
	private int age;
	
	private Country con;

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

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", age=" + age + ", con=" + con + "]";
	}

	public Student(int std_id, String std_name, int age, Country con) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.age = age;
		this.con = con;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
