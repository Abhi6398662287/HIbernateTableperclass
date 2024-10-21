package com.jtc.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WCSTU")
public class WeekendStudent  extends CurrentStudent{
	@Column(name="wsalary")
	private double wsalary;
	@Column(name="wcompany")
	private String wcompany;
	@Column(name="wemail")
	private String wemail;
	
	public WeekendStudent(String sname, String email, long phone) {
		super(sname, email, phone);
		// TODO Auto-generated constructor stub
	}
	public WeekendStudent(double wsalary, String wcompany, String wemail) {
		this.wsalary = wsalary;
		this.wcompany = wcompany;
		this.wemail = wemail;
	}
	public WeekendStudent() {
	System.out.println("Default Constructor in Class WeekendStudent");
	}
	public double getWsalary() {
		return wsalary;
	}
	public void setWsalary(double wsalary) {
		this.wsalary = wsalary;
	}
	public String getWcompany() {
		return wcompany;
	}
	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}
	public String getWemail() {
		return wemail;
	}
	public void setWemail(String wemail) {
		this.wemail = wemail;
	}
	
	

}
