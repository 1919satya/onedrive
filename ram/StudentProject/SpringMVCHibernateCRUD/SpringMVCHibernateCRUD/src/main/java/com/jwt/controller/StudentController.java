package com.jwt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import com.jwt.service.ExamService;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
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
	private StudentService StudentService;
	@Autowired
	private ExamService examService;

	@RequestMapping(value = "/")
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		logger.debug("debug:" +new Date()+this.getClass()+ "listStudent()"+"entering into");
        List<Student> listStudent = StudentService.getAllStudents();
		logger.debug("debug:" +new Date()+this.getClass()+ "listStudent()"+"calling the  student service");
        model.addObject("listStudent", listStudent);
		logger.debug("debug:" +new Date()+this.getClass()+ "listStudent()"+"calling is completed and no of student");
		model.setViewName("home");
		logger.debug("debug:" +new Date()+this.getClass()+ "listStudent()"+"going home ");

		return model;
	}

	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Student student = new Student();
		model.addObject("student", student);
		model.setViewName("StudentForm");
		return model;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		if (student.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			StudentService.addStudent(student);
		} else {
			StudentService.updateStudent(student);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		StudentService.deleteStudent(studentId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = StudentService.getStudent(studentId);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);

		return model;
	}

	@RequestMapping(value = "/newExam", method = RequestMethod.GET)
	public ModelAndView newContact1(HttpServletRequest request,ModelAndView model) {
		Exam exam = new Exam();
		exam.setSid(Integer.parseInt(request.getParameter("sid")));
		model.addObject("exam", exam);
		model.setViewName("ExamForm");
		return model;
	}
	@RequestMapping(value = "/saveExam", method = RequestMethod.POST)
	public ModelAndView saveExam(@ModelAttribute Exam exam) {
		//logger.debug("debug:" +new Date()+this.getClass()+ " saveExam()"+" Exam.sid "+ exam.getSid());
		//logger.debug("debug:" +new Date()+this.getClass()+ " " + exam.getSid() + " " + exam.getSubName() + "" + exam.getMarks());
		//System.out.println(exam.toString());
		if (exam.getMi() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			examService.addExam(exam);
		} else {
			System.out.println("\n\n\n\nStudent id is"+exam.getSid()+"\n\n\n\n\n");
		    examService.updateExam(exam);
		}
		return new ModelAndView("redirect:/");
	}

	
	

	@RequestMapping(value = "/showExam")
	public ModelAndView showExam(HttpServletRequest request,ModelAndView model) throws IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		// System.out.println("SID : " + sid);
		logger.debug(new Date() +"  "+ this.getClass() + " Method name : listExam()" + " entering into method...");
		logger.debug(new Date() +"  "+ this.getClass() + " Method name : listExam()" + " calling exam service...");
		List<Exam> examList = examService.getExamsBySid(sid);
		for (Exam exam : examList) {
			System.out.println(exam.getMi());
		}
		logger.debug(new Date() +"  "+ this.getClass() + " Method name : listExam()" + " getAllExam() successfuly executed ...no of exam received " +  examList.size());
		model.addObject("sid",Integer.parseInt(request.getParameter("sid")));
		model.addObject("examList", examList);
		model.setViewName("ExamShow");
		logger.debug(new Date() +"  "+ this.getClass() + " Method name : listExam()" + " redirecting to home ...");
		return model;
	}


	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)
	public ModelAndView deleteExam(HttpServletRequest request) {
		logger.debug(new Date() +" Class : "+ this.getClass() + "Method name : deleteExam()" + " entering into method...");
		logger.debug(new Date() +" Class : "+ this.getClass() + "Method name : newExam()" + " fetching exam id from request ...");
		int examId = Integer.parseInt(request.getParameter("mi"));
		logger.debug(new Date() +" Class : "+ this.getClass() + "Method name : newExam()" + " deleting exam ..."+ request.getParameter("id"));
		examService.deleteExam(examId);
		logger.debug(new Date() +" Class : "+ this.getClass() + "Method name : newExam()" + " redirecting to home ...");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editExam", method = RequestMethod.GET)
	public ModelAndView editExam(HttpServletRequest request) {
		logger.debug(new Date() +"  "+ this.getClass() + "Method name : editExam()" + " entering into method...");
		int mi = Integer.parseInt(request.getParameter("mi"));
		Exam exam = examService.getExamById(mi);
		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("exam", exam);
		return model; 	
	}

}