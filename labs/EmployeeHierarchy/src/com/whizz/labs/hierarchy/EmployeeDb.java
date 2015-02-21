package com.whizz.labs.hierarchy;

import java.util.LinkedList;
import java.util.List;

public class EmployeeDb implements IEmployeeDb {
	
	// TODO: Add list of employees
	List<Employee> employeeList = new LinkedList<Employee>();

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public void updateEmployee(Long id, Employee e) {
		// TODO Auto-generated method stub
		
	}
	
	// Constructor
	EmployeeDb() {
		Employee e1 = new Employee(1L, "whitefield");
		employeeList.add(e1);
		
		Employee e2 = new Employee(2L, "bangalore");
		employeeList.add(e2);
	}

}
