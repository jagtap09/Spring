package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
//  for creating the multiple beans
@Scope("prototype")
public class Employee {
	@Value("1")
	private int emp_id;
	@Value("29")
	private int age;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", age=" + age + "]";
	}
	public Employee(int emp_id, int age) {
		super();
		this.emp_id = emp_id;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
