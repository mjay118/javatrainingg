package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=se.load(Student.class, 113);
		se.delete(s);
		//se.contains(obj)--->>it tells us that this object exists or not.It didn't check into database that whether value exists or not.
		//For ex, id-113 doesn't exists in my database but its object is there in session, so its showing true.
		System.out.println(se.contains(s));
		tx.commit();
		se.close();
		sf.close();
	}

}
