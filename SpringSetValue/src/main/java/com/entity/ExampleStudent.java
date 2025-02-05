package com.entity;

public class ExampleStudent {
	
	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ExampleStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ExampleStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ExampleStudent [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
