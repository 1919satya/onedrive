package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudent(int id);

	public Student getStudent(int id);

	public Student updateStudent(Student student);
}
