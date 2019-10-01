package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.StudentDAO;
import com.jwt.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	@Transactional
	public void addStudent(Student student) {
		studentDAO.addStudent(student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		return studentDAO.getAllStudents();
	}

	@Override
	@Transactional
	public void deleteStudent(Integer rNo) {
		studentDAO.deleteStudent(rNo);
	}

	public Student getStudent(int rNo) {
		return studentDAO.getStudent(rNo);
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.updateStudent(student);
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	

}
