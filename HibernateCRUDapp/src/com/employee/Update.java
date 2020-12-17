package com.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Update {
	public static void update() throws Exception {
		Session se=HibernateConfig.config();
		Scanner sc = new Scanner(System.in);
		int choice = 0, a = 0;
		String option = "";
		do {
			Transaction tx=se.beginTransaction();
			System.out.println(
					"Select your option\n 1. update name \n 2. update age \n 3. update desg \n 4. update salary \n 5. update address \n 6. update phone");
			choice=sc.nextInt();
			if (choice == 1) {
				Query qr=se.createQuery("update Employee e set e.ename=:x where e.eid=:y");
				System.out.println("Enter new name:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which name to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Name updated");
			} else if (choice == 2) {
				Query qr=se.createQuery("update Employee e set e.age=:x where e.eid=:y");
				System.out.println("Enter new age:");
				qr.setParameter("x", sc.nextInt());
				System.out.println("enter the id to which salary to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Age updated");
			} else if (choice == 3) {
				Query qr=se.createQuery("update Employee e set e.desg=:x where e.eid=:y");
				System.out.println("Enter new department:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which department to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Designation updated");
			} else if (choice == 4) {
				Query qr=se.createQuery("update Employee e set e.salary=:x where e.eid=:y");
				System.out.println("Enter new designation:");
				qr.setParameter("x", sc.nextInt());
				System.out.println("enter the id to which designation to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Salary updated");
			} else if (choice == 5) {
				Query qr=se.createQuery("update Employee e set e.address=:x where e.eid=:y");
				System.out.println("Enter new address:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which address to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Address updated");
			} else if (choice == 6) {
				Query qr=se.createQuery("update Employee e set e.mob=:x where e.eid=:y");
				System.out.println("Enter new phone:");
				qr.setParameter("x", sc.nextInt());
				System.out.println("enter the id to which phoneNumber to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Mobile No. updated");
			} 
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
		se.close();
	}
}
