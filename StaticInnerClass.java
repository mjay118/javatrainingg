package com.staticnestedclass;

class Laptop {

	static class Discount {
		void announcement() {
				System.out.println("10 per discount");
		}
		static void offer() {
			System.out.println("best price");
		}
	}

}

public class StaticInnerClass {

	public static void main(String[] args) {
		Dell.Discount q3450=new Dell.Discount();
		q3450.announcement();
		q3450.Discount.offer();

	}

}