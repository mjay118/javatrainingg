package com.employee;

import java.util.Scanner;

public class HibernateMain {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Select your option\n 1. Insert\n 2. Display\n 3. Update\n 4. Delete\n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				Insert.insert();
			}else if(choice == 2) {
				Display.display();
			}else if(choice == 3) {
				Update.update();
			}
		}while(choice!=4);
	}

}
