package com.tut;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); //we can give "hibernate.cfg.xml" in round braces
        SessionFactory factory = cfg.buildSessionFactory();
        
//        Creating Student
        Student st = new Student();
        st.setId(102);
        st.setName("Abhijit");
        st.setCity("Mumbai");
        System.out.println(st);
        
        //Creating object of address class
        Address ad = new Address();
        ad.setStreet("Street1");
        ad.setCity("Mumbai");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        
        //Reading image
//        FileInputStream fis = new FileInputStream("src/main/java/hello.jpg");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        ad.setImage(data);
        
        Session session = factory.openSession();
               
        Transaction tx = session.beginTransaction();
        session.persist(st);
        session.persist(ad);
        tx.commit();
        session.close();
        System.out.println("Done...");
    }
}
