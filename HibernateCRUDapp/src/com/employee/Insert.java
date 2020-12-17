package com.employee;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert {
	public static void insert() throws Exception {
		Session se=HibernateConfig.config();
		Scanner sc=new Scanner(System.in);
		String choice="";
		do {
			Transaction tx=se.beginTransaction();
			Employee e=new Employee();
			 System.out.println("enter employee id: ");
			   e.setEid(sc.nextInt());
			    System.out.println("enter employee name :");
			    e.setEname(sc.next());
			    System.out.println("enter employee age: ");
			    e.setAge(sc.nextInt());
			    System.out.println("enter employee desg: ");
			    e.setDesg(sc.next());
			    System.out.println("enter employee salary : ");
			    e.setSalary(sc.nextInt());
			    System.out.println("enter employee address: ");
			    e.setAddress(sc.next());
			    System.out.println("enter employee pin: ");
			   e.setPin(sc.nextInt());
			   System.out.println("enter employee mob: ");
			   e.setMob(sc.nextInt());
			    Serializable s=se.save(e);
			tx.commit();
			if(s.hashCode()>0) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
		se.close();
	}
}
