package com.entity;

public class Country {
	
	private int c_id;
	private String name;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [c_id=" + c_id + ", name=" + name + "]";
	}
	public Country(int c_id, String name) {
		super();
		this.c_id = c_id;
		this.name = name;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
