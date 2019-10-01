package com.jwt.dao;

import java.util.List;
import com.jwt.model.Student;

public interface StudentDAO {

	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer rNo);

	public Student updateStudent(Student student);

	public Student getStudent(int rNo);
}
