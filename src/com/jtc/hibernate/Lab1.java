package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Lab1 {
	public static void main(String arg[]) {
		Transaction txs = null;
		try {
		    SessionFactory sessionFactory = hibernateutil.getSessionFactory();
		    Session session = sessionFactory.openSession();
		    txs = session.beginTransaction();
              System.out.println(sessionFactory);
              System.out.println(session);
		    // Your entities
		    Student s1 = new Student("Abhishek", "Abhishek9457063712@gmail.com", 6398662287L);
		    session.save(s1);

		    CurrentStudent cs1 = new CurrentStudent(666.78, "Evening", "Vivek sir");
		    session.save(cs1);

		    OldStudent os1 = new OldStudent(50000.00, "TCS", "Ak2162586@gmail.com");
		    session.save(os1);

		    WeekendStudent ws1 = new WeekendStudent(30000.00, "HCL", "ak216368767@gmail.com");
		    session.save(ws1);

		    WeekdayStudent wy1 = new WeekdayStudent(3596, 16165.67, "BA");
		    session.save(wy1);

		    // Commit transaction
		    txs.commit();
		    session.close();
		} catch (Exception e) {
		    if (txs != null) {
		        txs.rollback();  // Rollback in case of exception
		    }
		    e.printStackTrace();  // Print stack trace for debugging
		}


}}
