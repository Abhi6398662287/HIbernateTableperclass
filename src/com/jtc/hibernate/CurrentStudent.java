package com.jtc.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CSTU")
public class CurrentStudent extends Student {
	@Column(name="feebal")
private double feebal;
	@Column(name="timing")
private String timing;
	@Column(name="trainer")
private String trainer;
	public CurrentStudent() {
		System.out.println("Default Constructor of class CurrentStudent");
	}
	public CurrentStudent(String sname, String email, long phone) {
		super(sname, email, phone);
		// TODO Auto-generated constructor stub
	}
	
	public CurrentStudent(double feebal, String timing, String trainer) {
		this.feebal = feebal;
		this.timing = timing;
		this.trainer = trainer;
	}
	public double getFeebal() {
		return feebal;
	}
	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	

}
