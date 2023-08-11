package com.java;

import java.util.Scanner;

public class ProductDiscount {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product name");
		String name = scanner.nextLine();

		float discount;
		float amount;
		System.out.println("Enter product price");
		float price = scanner.nextFloat();

		if (price > 0 && price <= 10000) {
			discount = price * 0.05f;
		} else if (price > 10000 && price <= 20000) {
			discount = price * 0.01f;
		} else if (price > 20000 && price <= 35000) {
			discount = price * 0.15f;
		} else {
			discount = price * 0.20f;
		}
		amount = price - discount;
		System.out.println("product Name:" + name);
		System.out.println("price is " + price);
		System.out.println("Discount is " + discount);
		System.out.println("The amount to be paid " + amount);
	}
}
