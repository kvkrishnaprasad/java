package com.whizz.labs.hierarchy;

public class Employee {
	private Long id;
	private String name;
	
	// TODO: Add manager ID
	
	public Employee(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// TODO: Add getter and setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
}
