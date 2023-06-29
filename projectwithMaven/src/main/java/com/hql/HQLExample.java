package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.tut.Student;
import com.tut.Certificate;

public class HQLExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory f= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
				
		//Hql:
		//Syntax:
		//
//		String query = "from Student as s where s.name=:n and s.city=:x";
//		
//		Query q= s.createQuery(query);
//		
//		q.setParameter("x", "sangamner");
//		q.setParameter("n", "Abhijit_R_s");
//		
//		//single result
//		//multiple result;
//		List<Student> list= q.list();
//		
//		for(Student student:list) {
//			System.out.println(student.getName() +" : "+student.getCerti().getCourse());
//		}
		
		//For Deleting Records
//		Query q2 = s.createQuery("delete from Student where city=:c");
//		q2.setParameter("c", "Nashik");
//		int r = q2.executeUpdate();
//		System.out.println(r);
		
		
//		//For Updating Records
//		Query q3 = s.createQuery("update Student set city=:c where name=:n");
//		q3.setParameter("c", "Nashik");
//		q3.setParameter("n", "Srushti_R_S");
//		int r = q3.executeUpdate();
//		System.out.println(r);
		
		//To Exicute join Query
		Query q4 = s.createQuery("select q.question, q.questionId ,a.answer from Question as q INNER JOIN q.answer as a");
		List<Object[]> l4 = q4.getResultList();
		
		for(Object[] arr: l4 ){
			System.out.println(Arrays.toString(arr));
		}
		
		tx.commit();
		s.close();
		f.close();
	}
}
