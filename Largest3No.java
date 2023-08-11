package com.java;

import java.util.Scanner;

public class Largest3No {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st No");
		int num1=scanner.nextInt();
		
		System.out.println("Enter 2nd No");
		int num2=scanner.nextInt();
		
		System.out.println("Enter 3rd No");
		int num3=scanner.nextInt();
		
		int result=(num1>num2)?num1:num2;
		int res=(result>num3)?result:num3;
		System.out.println("Largest no is "+res);
	}
}
