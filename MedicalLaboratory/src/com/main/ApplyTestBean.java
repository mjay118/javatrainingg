package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.BloodTest;
import com.pojo.UrineTest;

public class ApplyTestBean {

	public static boolean apply(BloodTest bt) {
		
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.save(bt);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}

	public static boolean apply(UrineTest ut) {
		
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.save(ut);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}

}