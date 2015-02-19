package com.whizz.labs.employee;

import java.util.ArrayList;
import java.util.List;

public class Service {
	public static void main(String[] args) {
		
		test1();
		//test2();
	}
	
	public static void test1() {
		Employee e = new Employee();
		
		e.setName("Krishna");
		
		// TODO 1c: Add id
		
		e.print();
	}
	
	// Test constructor
	public static void test2() {
		// TODO 2b: Create employee with new constructor
		
		// TODO 2c: Print details
		//e.print();
	}
	
	public static void test3() {
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		list.add(e1);
		list.add(e2);
		
		// TODO 3a: create one more employee and push
		
		// TODO 3b: Loop over 
	}
}
