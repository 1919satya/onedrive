package com.hcl.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transactional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Employee;
import com.hcl.repository.EmployeeRepository;




@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	 EmployeeRepository employeeRep;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeelist =(List<Employee>) employeeRep.findAll();
		if(employeelist.size() > 0) {
			return employeelist;
		} else {
			return new ArrayList<Employee>();
		}
		
	}
	@Override
	public String addEmployee(String empStr) {
	Object obj=JSONValue.parse(empStr);
	 JSONObject jsonObject= (JSONObject) obj;
	 Employee emp=new Employee();
	 long id = (long) jsonObject.get("id");
	 emp.setId((int)id);
	 String name = (String) jsonObject.get("name");  
	 emp.setName(name);
	 double salary = (double) jsonObject.get("salary");
	 emp.setSalary(salary);
	 Employee e=employeeRep.save(emp);
	 if(emp != null) {
	 return "**Employee Successfully Created**";
	 }
	 else {
	 return "**Not Created**";
	 }

}


	
	@Override
	public String deleteEmployee(int id) {
		employeeRep.deleteById(id);
		return "**Deleted***";
	}
	
	
	
	@Override
	public String getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String addEmployees(List<Employee> empStr) {
		List<Employee> lst=(List<Employee>) employeeRep.saveAll(empStr);
return "***Create succesfully**";
	}
	@Override
	public String deleteEmployees(List<Employee> id) {
		employeeRep.deleteAll(id);
		return "*Record Deleted*888";
	}
	
	}
