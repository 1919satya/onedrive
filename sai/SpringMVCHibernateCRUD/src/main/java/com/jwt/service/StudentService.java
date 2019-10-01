package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteStudent(Integer rNo);

	public Student getStudent(int rNo);

	public Student updateStudent(Student student);
}
