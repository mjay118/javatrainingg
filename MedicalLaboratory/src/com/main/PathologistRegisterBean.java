package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Pathologist;

public class PathologistRegisterBean {
	public static boolean register(Pathologist path) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o= se.save(path);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
		
	}

}