package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Merge {
public static void main(String[] args) {
	Configuration cf=new Configuration();
	cf.configure("configuration.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session se=sf.openSession();
	Transaction tx=se.beginTransaction();
	Student s=se.load(Student.class, 112);
	s.setName("Ron");
	s=(Student)se.merge(s);
	tx.commit();
	System.out.println(s.toString());
	se.close();
	sf.close();
}
}

