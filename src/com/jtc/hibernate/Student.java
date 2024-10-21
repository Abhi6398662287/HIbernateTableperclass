package com.jtc.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "MyStudent")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Use AUTO for table-per-class
    @Column(name = "sid")
    private int sid;

    @Column(name = "sname")
    private String sname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private long phone;

    public Student() {
        System.out.println("Default Constructor of Class Student");
    }

    public Student(String sname, String email, long phone) {
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
