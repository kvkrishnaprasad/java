package com.whizz.labs.hierarchy;

public class Service {
	
	static EmployeeDb employeeDb = new EmployeeDb();
	
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		employeeDb.getEmployee(1L).print();
	}
	
	// Test2. Add employee and get their details
	public static void test2_add_employee() {
		// Create an employee
		
		// Add employeee to list
		
		// Get that employee details
	}
	
	// Test 3. Addd manager details
	public static void test3_get_manager_name() {
		
	}
}
