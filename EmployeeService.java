package com.saveoperation.service;

import com.saveoperation.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee); // Use for Create Table & POST(Insert) Data Into Database 
	
	public Employee getEmployeeById(Integer id);  // Use to get(retrieve) Data from Database
	
	public void deleteEmployee(Integer id); // Program Run on the delete Data from Database

}
