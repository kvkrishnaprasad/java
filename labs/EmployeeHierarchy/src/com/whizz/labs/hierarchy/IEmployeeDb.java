package com.whizz.labs.hierarchy;

public interface IEmployeeDb {
	public Employee getEmployee(Long id);
	public void updateEmployee(Long id, Employee e);
}
