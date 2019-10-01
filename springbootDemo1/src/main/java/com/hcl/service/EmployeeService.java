package com.hcl.service;

import java.util.List;

import com.hcl.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public String addEmployee(String empStr);
	public String addEmployees(List<Employee> empStr);
	public String deleteEmployee(int id);
	public String deleteEmployees(List<Employee> id);
	public String getEmployee(int id);
	public String getEmployeeByName(String name);



}
