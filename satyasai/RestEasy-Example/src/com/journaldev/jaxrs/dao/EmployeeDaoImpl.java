 package com.journaldev.jaxrs.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.journaldev.jaxrs.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public void addEmployee(Employee e) {
		sessionFactory.getCurrentSession().saveOrUpdate(e);

		
	}

	@Override
	public void deleteEmployee(int id) {
		Employee e = (Employee) sessionFactory.getCurrentSession().load(
				Employee.class, id);
		if (null != e) {
			this.sessionFactory.getCurrentSession().delete(e);
		}
	}

	@Override
	public Employee getEmployee(int id) {
		return (Employee) sessionFactory.getCurrentSession().get(
				Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		

			return sessionFactory.getCurrentSession().createQuery("from Employee").list();
		
		
		
	}

}