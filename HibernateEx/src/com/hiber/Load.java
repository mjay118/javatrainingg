package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Load {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=se.load(Student.class, 112);
		//Load class use concept of proxy object. It gives us object only when we want.
		//Load don't give object.
		//Proxy Object----->>>Fake Object or Blank Object
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(s);
		se.close();
		tx.commit();
		se.close();
		sf.close();
	}

}
