package com.hcl.java8streams.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.java8streams.model.Employee;
import com.hcl.java8streams.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("SEmployeeController()");
	}
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		logger.debug("debug:" +new Date()+" "+this.getClass()+ "listEmployee() entering into");
        List<Employee> listEmployee =  employeeService.getAllEmployees();
		logger.debug("debug:" +new Date()+this.getClass()+ "listEmployee()"+"calling the  Employee service");
      
		logger.debug("debug:" +new Date()+this.getClass()+ "listEmployee()"+"calling is completed and no of Employee");
		logger.debug(listEmployee.get(0).getEmpName());
		model.addObject("listEmployee", listEmployee);
		model.addObject("searchEmployee",new Employee());
		model.setViewName("home");
		logger.debug("debug:" +new Date()+this.getClass()+ "listEmployee()"+"going home ");
		return model;
	}
	@RequestMapping(value = "searchEmployee")
	public ModelAndView searchEmployee(ModelAndView model, @ModelAttribute Employee searchEmployee) throws IOException {
	//	logger.debug("debug:" +new Date()+" "+this.getClass()+ "listEmployee() entering into");
        List<Employee> listEmployee =  employeeService.getAllEmployees();
        listEmployee = listEmployee.stream().filter((var) -> ( searchEmployee.getSalary()==0.0 || var.getSalary() >searchEmployee.getSalary()) && (searchEmployee.getBand()=='0'|| var.getBand()==searchEmployee.getBand()) && var.getEmpName().startsWith(searchEmployee.getEmpName())).collect(Collectors.toList()); 
		//logger.debug("debug:" +new Date()+this.getClass()+ "listEmployee()"+"calling the  Employee service");
        model.addObject("listEmployee", listEmployee);
        model.addObject("searchEmployee",searchEmployee);
    	model.setViewName("home");
		//logger.debug("debug:" +new Date()+this.getClass()+ "listEmployee()"+"calling is completed and no of Employee");
		//logger.debug(listEmployee.get(0).getEmpName());
	
		// logger.debug("debug:" +new Date()+this.getClass()+ "listEmployee()"+"going home ");

		return model;
	}
}
