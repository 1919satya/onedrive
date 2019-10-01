package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);

	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {

		return sessionFactory.getCurrentSession().createQuery("from Student")
				.list();
	}

	@Override
	public void deleteStudent(Integer id) {
		Student student = (Student) sessionFactory.getCurrentSession().load(
				Student.class, id);
		if (null != student) {
			this.sessionFactory.getCurrentSession().delete(student);
		}

	}

	public Student getStudent(int id) {
		return (Student) sessionFactory.getCurrentSession().get(
				Student.class, id);
	}

	@Override
	public Student updateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
		return student;
	}

}