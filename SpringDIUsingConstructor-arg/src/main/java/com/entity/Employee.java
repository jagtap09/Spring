package com.entity;

public class Employee {
	private int emp_id;
	private String emp_name;
	private int emp_age;
	
	private Country con;

	public Employee(int emp_id, String emp_name, int emp_age, Country con) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.con = con;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", con=" + con + "]";
	}
	
	

}
