package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get - student 102
		Student st = (Student)session.get(Student.class,102);
		
		Address ad = (Address)session.get(Address.class, 1);
//		Student st = (Student)session.load(Student.class,102); //we can use load also 
		
		System.out.println(ad);
		System.out.println(st);
		
		session.close();
		factory.close();
		
	}
}
