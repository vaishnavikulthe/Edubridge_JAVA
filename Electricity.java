package com.java;

import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st No");
		int bill=scanner.nextInt();
		
		if(bill>400)
		{
			System.out.println("5.80 Units");
		}
		else if(bill>300 && bill<=400)
		{
			System.out.println("5.10 units");
		}
		else if(bill>200 && bill<=300)
		{
			System.out.println("4.40 units");
		}
		else if(bill<=200)
		{
			System.out.println("3.80 units");
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
}
