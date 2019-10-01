package com.jwt.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.jwt.service.GradeInterface;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String country;
	private Date dateofJoin;
	private double finalScore;
	@Column(name="rollNo")
	private int rollNo;
	@Column
	private int age;
	@Column(name="gender")
	private String gender;

	@Column(name="sname")
	private String name;
	@Transient
	private String grade;

	public String getGrade() {
		GradeInterface gInt=(double x) -> {String grade = x<40 ? "Fail" : x<60 ? "Average" : x<75 ? "FirstClass" : "Distinction"; return grade;};
		return gInt.getGrade(this.finalScore);
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateofJoin() {
		return dateofJoin;
	}

	public void setDateofJoin(Date dateofJoin) {
		this.dateofJoin = dateofJoin;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
