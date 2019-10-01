package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Student;
import com.jwt.service.StudentService;

@Controller
public class StudentController {

	private static final Logger logger = Logger
			.getLogger(StudentController.class);

	public StudentController() {
		System.out.println("StudentController()");
	}

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/")
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		List<Student> listStudent = studentService.getAllStudent();
		model.addObject("listStudent", listStudent);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newStudent(ModelAndView model) {
		Student student = new Student();
		model.addObject("student", student);
		model.setViewName("StudentForm");
		return model;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		if (student.getRollNo() == 0) { // if student id is 0 then creating the
			// employee other updating the employee
			studentService.addStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		int rNo = Integer.parseInt(request.getParameter("rollNo"));
		studentService.deleteStudent(rNo);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request) {
		int rNo = Integer.parseInt(request.getParameter("rollNo"));
		Student student = studentService.getStudent(rNo);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);

		return model;
	}

}