package com.tut;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student st = new Student();
		st.setId(123);
		st.setName("sagar");
		st.setCity("Nashik");
		
		Certificate  cf= new Certificate();
		cf.setCourse("java");
		cf.setDuration("2 months");
		st.setCerti(cf);
		
		Student st1 = new Student();
		st1.setId(133);
		st1.setName("rahul");
		st1.setCity("Nashik");
		
		Certificate  cf1= new Certificate();
		cf1.setCourse("hibernate");
		cf1.setDuration("1 months");
		st1.setCerti(cf1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.persist(st);
		s.persist(st1);
		
		tx.commit();
		factory.close();
		
		
	}
}
