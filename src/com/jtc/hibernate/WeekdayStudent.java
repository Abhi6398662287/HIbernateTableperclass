package com.jtc.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WCSTU")
public class WeekdayStudent extends CurrentStudent {
	@Column(name="yop")
	private int yop;
	@Column(name="percentage ")
	private double percentage;
	@Column(name="qualification")
	private String qualification;
	public WeekdayStudent() {
		System.out.println("Default Constructor in class WeekDayStudent");
	}
	public WeekdayStudent(String sname, String email, long phone) {
		super(sname, email, phone);
		// TODO Auto-generated constructor stub
	}
	public WeekdayStudent(int yop, double percentage, String qualification) {
		this.yop = yop;
		this.percentage = percentage;
		this.qualification = qualification;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	 
	

}
