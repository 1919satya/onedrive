package com.hcl.java8streams.service;

import java.util.List;

import com.hcl.java8streams.model.Employee;


public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(int id);

	public Employee getEmployee(int id);

	public Employee updateStudent(Employee employee);
		
}
