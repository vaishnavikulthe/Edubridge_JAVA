package com.java;

import java.util.Scanner;

public class PriceDiscount {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product name");
		String name = scanner.nextLine();

		float discount;
		float amount;
		System.out.println("Enter product price");
		float price = scanner.nextFloat();

		if (price > 0 && price <= 1000) {
			discount = price * 0.02f;
		} else if (price > 1000 && price <= 3000) {
			discount = price * 0.1f;
		} else {
			discount = price * 0.15f;
		}
		amount = price - discount;
		System.out.println("product Name:" + name);
		System.out.println("price is " + price);
		System.out.println("Discount is " + discount);
		System.out.println("The amount to be paid " + amount);
	}
}
