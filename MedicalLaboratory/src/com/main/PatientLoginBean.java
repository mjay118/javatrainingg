package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Patient;

public class PatientLoginBean {

	public static Patient login(String email, String password) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query q=se.createQuery("from Patient p where p.patient_email=:x and p.patient_password=:y");
		q.setParameter("x", email);
		q.setParameter("y", password);
		List<Patient> l=q.list();
		tx.commit();
		if(!l.isEmpty()) {
			Patient pa = l.get(0);
			return pa;
		}
		return null;
	}
	
}