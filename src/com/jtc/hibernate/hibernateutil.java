package com.jtc.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class hibernateutil {
    static SessionFactory sessionFactory = null;
    static {
        try {
            Configuration cfg = new Configuration();
            Properties mygroup = new Properties();
            
            mygroup.put(Environment.DRIVER, "com.mysql.jdbc.Driver"); // updated driver
           
            mygroup.put(Environment.URL, "jdbc:mysql://localhost:3306/jtcdb1");
            
            mygroup.put(Environment.USER, "root");
            mygroup.put(Environment.PASS, "2580");
            mygroup.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
           
            mygroup.put(Environment.SHOW_SQL, "true");
            mygroup.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            mygroup.put(Environment.HBM2DDL_AUTO, "update");
            cfg.setProperties(mygroup);

            // Adding annotated classes
            cfg.addAnnotatedClass(Student.class);
            cfg.addAnnotatedClass(CurrentStudent.class);
            cfg.addAnnotatedClass(OldStudent.class);
            cfg.addAnnotatedClass(WeekdayStudent.class);
            cfg.addAnnotatedClass(WeekendStudent.class);
          
            // Service Registry
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();

            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
            System.out.println("Hibernate setup complete!");
        } catch (Exception e) {
            e.printStackTrace();  // Log exception details
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
