package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.pojo.Patient;

public class PatientUpdateBean {
	public static boolean update(Patient pat) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.merge(pat);
		tx.commit();
		if(o!=null)
			return true;
		else
			return false;
	}
}
