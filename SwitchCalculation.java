package com.java;

import java.util.Scanner;

public class SwitchCalculation {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st No : ");
		int no1 = scanner.nextInt();

		System.out.println("Enter 2nd no : ");
		int no2 = scanner.nextInt();

		System.out.println("Enter Choice : ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {

			int add = no1 + no2;
			System.out.println("addition is : " + add);
			break;
		}
		case 2: {

			int sub = no1 - no2;
			System.out.println("Substraction is  : " + sub);
			break;
		}
		case 3: {

			int mul = no1 * no2;
			System.out.println("Multiplication is " + mul);
			break;
		}
		case 4: {
			if (no2 != 0) {
				int div = no1 / no2;
				System.out.println("Division is : " + div);
			} else {
				System.out.println("One value is zero so can't divide");
			}
			break;
		}
		case 5: {
			int mod = no1 % no2;
			System.out.println("Modulus is : " + mod);
			break;
		}
		}
	}

}
