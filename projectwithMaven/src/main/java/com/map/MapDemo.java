package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class MapDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Creating Question
//		Question q1 = new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("What is Java ?");
////		q1.setAnswer(a1);
//		
////		creating answer
//		Answer a1 = new Answer();
//		a1.setAnswerId(343);
//		a1.setAnswer("Java is a programming Language");
//		a1.setQuestion(q1);
//		
//		Answer a2 = new Answer();
//		a2.setAnswerId(344);
//		a2.setAnswer("Java is OOP's based Language");
//		a2.setQuestion(q1);
//		
//		Answer a3 = new Answer();
//		a3.setAnswerId(345);
//		a3.setAnswer("Java is a platform independent");
//		a3.setQuestion(q1);
//		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
		
//		q1.setAnswer(a1);
//		
////		Creating Question
//		Question q2 = new Question();
//		q2.setQuestionId(242);
//		q2.setQuestion("What is Collection Framework ?");
////		q1.setAnswer(a1);
//		
////		creating answer
//		Answer a2 = new Answer();
//		a2.setAnswerId(344);
//		a2.setAnswer("API to work With group of objects");
//		a2.setQuestion(q2);
//		
//		q2.setAnswer(a2);
//		
////		Creating Question
//		Question q3 = new Question();
//		q3.setQuestionId(234342);
//		q3.setQuestion("How to work with NetBeans ?");
////		q1.setAnswer(a1);
//		
////		creating answer
//		Answer a3 = new Answer();
//		a3.setAnswerId(777);
//		a3.setAnswer("IDE For Writing Codes");
//		a3.setQuestion(q3);
//		
//		q3.setAnswer(a3);
		
		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		
//		s.persist(q1);
////		s.persist(q2);
////		s.persist(q3);
//		
//		s.persist(a1);
//		s.persist(a2);
//		s.persist(a3);
		
		
		
		tx.commit();
		
		Question newQ = (Question)s.get(Question.class,1212);
		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAnswer());
		for(Answer a:newQ.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		
		s.close();
		factory.close();
	}
}
