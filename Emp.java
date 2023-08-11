package com.java;

import java.util.Scanner;

public class Emp {
	
		int id;
		String name;
		double sal;
		int age;
		void getDetails()
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id");
		 id=scanner.nextInt();
		
		System.out.println("Enter name");
		name=scanner.next();
		
		System.out.println("Enter salary");
		 sal=scanner.nextDouble();
		
		System.out.println("Enter Age");
		 age=scanner.nextInt();
		}
		
		void displayResult()
		{
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Salary : "+sal);
			System.out.println("Age : "+age);
		}
}


