package com.java;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("ENter Name");
		String name=scanner.nextLine();
		
		
		System.out.println("Enter age");
		int age=scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter address");
		String address=scanner.nextLine();
		
		System.out.println("Enter Salary");
		double salary=scanner.nextDouble();
		
		System.out.println("Enter Phone");
		long phone=scanner.nextLong();
		
		System.out.println("Enter Gender");
		char gender=scanner.next().charAt(0);
		
		System.out.println("Employee id is : "+id);
		System.out.println("Employee name is : "+name);
		System.out.println("Employee address is : "+address);
		System.out.println("Employee Salary is : " +salary);
		System.out.println("Employee age is : "+age);
		System.out.println("Employee phone is : "+phone);
		System.out.println("Employee gender is : "+gender);
		
		
	}
}
