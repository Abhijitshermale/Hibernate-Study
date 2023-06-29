package com.states;

import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StateDemo {
	public static void main(String[] args) {
		//practical of Hibernate Object States
		//Transient
		//Persistent
		//Detached
		//Removed
		System.out.println("Example :");
		
		SessionFactory f= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating Student object
//		Student student = new Student();
//		student.setId(123);
//		student.setName("Abhijit");
//		student.setCity("Sangamner");
//		student.setCerti(new Certificate("Java Hibernate Course","2 month"));
		//student : Transient
		
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
//		s.save(student);
		//student : Persistent - session, database
//		student.setName("Abhijit_R_S");
		for(int i=0; i<100; i++) {
			Student student = new Student();
			student.setId(i);
			student.setName("User"+i);
			student.setCity("City"+i);
			student.setCerti(new Certificate("Java Hibernate Course "+i,i+ " month"));
			s.save(student);
		}
		
		tx.commit();
		s.close();
		//student - Detached
//		student.setName("Abhijit_Shermale");
		
		f.close();
		
	}
}
