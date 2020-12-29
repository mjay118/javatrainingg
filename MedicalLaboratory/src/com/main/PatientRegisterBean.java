package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Patient;

public class PatientRegisterBean {

	public static boolean register(Patient pat) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o= se.save(pat);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
		
	}

}