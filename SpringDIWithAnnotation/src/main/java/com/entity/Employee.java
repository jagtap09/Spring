package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int emp_id;
	@Value("riya")
	private String emp_name;
	@Value("29")
	private int age;
	
	@Autowired
	
	private Country  conuntry;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getConuntry() {
		return conuntry;
	}

	public void setConuntry(Country conuntry) {
		this.conuntry = conuntry;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", conuntry=" + conuntry
				+ "]";
	}

	public Employee(int emp_id, String emp_name, int age, Country conuntry) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.conuntry = conuntry;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
