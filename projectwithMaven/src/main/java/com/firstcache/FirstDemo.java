package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//by default Enabled
		Student student = session.get(Student.class, 123);
		System.out.println(student);
		
		System.out.println("Dhichkyau dhum dhum dhum dhum dhum, Mai aur tum tum ....");
		
		Student student2 = session.get(Student.class, 123);
		System.out.println(student2);
		
		System.out.println(session.contains(student2));
		
		session.close();
	}
}
