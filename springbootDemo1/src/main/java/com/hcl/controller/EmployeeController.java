package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	@RequestMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list=empService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	@PostMapping("/add")
	
	public ResponseEntity<String>addEmployees(@RequestBody String empStr) {
		
		return new ResponseEntity<String>(empService.addEmployee(empStr),new HttpHeaders(),HttpStatus.OK);}

@PostMapping("/addEmployees")

public String addEmployees1(@RequestBody List<Employee> employee) {
	
	return empService.addEmployees(employee);
}
@DeleteMapping("/deleteEmployee/{id}")
	
public String deleteEmployee(@PathVariable int id) {
	return empService.deleteEmployee(id);
}
@PostMapping("/deleteEmployees")

public String deleteEmployees(@RequestBody List<Employee>   id) {
	return empService.deleteEmployees(id);
}
}