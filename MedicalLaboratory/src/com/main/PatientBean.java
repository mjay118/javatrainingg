package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Patient;

public class PatientBean {
public static List<Patient> getById(int id) {
		
		
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query q=se.createQuery("from Patient p where patient_id=:x");
		q.setParameter("x",id);
		List<Patient> pa=q.list();
		tx.commit();
		if(!pa.isEmpty()) {
			return pa;
		}
		return null;
		
	}	
}
