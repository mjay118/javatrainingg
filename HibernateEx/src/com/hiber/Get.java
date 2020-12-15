package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=se.get(Student.class, 112);
		Student s1=se.get(Student.class, 117);
		tx.commit();
		System.out.println(s.toString());
		System.out.println(s1);//It prints null as 117 not in database.
		se.close();
		sf.close();
	}
	}


