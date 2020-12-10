package com.anonymous;
abstract class Book{
	abstract void eat();
}
public class PublicAnonymousInnerClass {

	public static void main(String[] args) {
		new book() {
			void read() {
				System.out.println("Reading book");
			}
		}.eat();

	}

}
