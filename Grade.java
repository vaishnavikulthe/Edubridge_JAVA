package com.java;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st No");
		int num=scanner.nextInt();
		
		if(num>=90 && num<=100)
		{
			System.out.println("Grade A");
		}
		else if(num>=70 && num<90)
		{
			System.out.println("Grade B");
		}
		else if(num>=50 && num<70)
		{
			System.out.println("Grade C");
		}
		else if(num>0 && num<50)
		{
			System.out.println("Grade D");
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
}
