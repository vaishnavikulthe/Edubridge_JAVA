package com.java;

import java.util.Scanner;

public class DivisibleBy {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
		
		if(num%5==0 && num%3==0)
		{
			System.out.println("The "+num+" are divided by both 5 and 3");
			
		}
		else if (num%5==0) {
			System.out.println("The "+num+" is divided by 5 only");
			
		}
		else if (num%3==0) {
			System.out.println("The "+num+" is divided by 3 only");
			
		}
		else {
			System.out.println("not divided");
		}
	}
}
