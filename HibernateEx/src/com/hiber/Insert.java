package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Student s=new Student();
		s.setId(114);
		s.setName("Shravya");
		s.setMarks(650);
		Transaction tx=se.beginTransaction();
		se.save(s);
		tx.commit();
		se.close();
		sf.close();
	}
}
