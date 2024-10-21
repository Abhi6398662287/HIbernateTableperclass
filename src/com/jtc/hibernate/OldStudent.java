package com.jtc.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("OSTU")
public class OldStudent extends Student{
	@Column(name="salary")
private double salary;
	@Column(name="companyName")
private String comapanyName;
	@Column(name="email")
private String email;
	public OldStudent() {
		System.out.println("DEfault Constructor of Class OldStudent");
	}
	public OldStudent(String sname, String email, long phone) {
		super(sname, email, phone);
		// TODO Auto-generated constructor stub
	}
	public OldStudent(double salary, String comapanyName, String email) {
		this.salary = salary;
		this.comapanyName = comapanyName;
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getComapanyName() {
		return comapanyName;
	}
	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
