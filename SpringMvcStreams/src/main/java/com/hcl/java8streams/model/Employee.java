package com.hcl.java8streams.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	private static final long serialVersionUID = -3465813074586302847L;
	@Id
	@Column(name = "empNo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empNo;

	@Column(name = "empName")
	private String empName;

	@Column(name = "salary")
	private float salary;

	@Column(name = "band")
	private char band;

	@Column(name = "dateOfJoin")
	private Date dateOfJoin;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public char getBand() {
		return band;
	}

	public void setBand(char band) {
		this.band = band;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

}
