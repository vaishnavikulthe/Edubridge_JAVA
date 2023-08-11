package com.java;

import java.util.Scanner;

public class LargestFourth {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st No");
		int num1=scanner.nextInt();
		
		System.out.println("Enter 2nd No");
		int num2=scanner.nextInt();
		
		System.out.println("Enter 3rd No");
		int num3=scanner.nextInt();
		
		System.out.println("Enter 4 No");
		int num4=scanner.nextInt();
		
		if(num1>num2&&num1>=num3 && num1>num4)
		{
			System.out.println(num1);
		}
		else if (num2>num1 && num2>num3&& num3>num4) {
			System.out.println(num2);
		}
		else if (num3>num1&&num3>num2&&num3>num4) {
			System.out.println(num3);
		}
		else {
			System.out.println(num4);
		}
		
//		int result=(num1>num2)?num1:num2;
//		int res=(result>num3)?result:num3;
//		int last=(res>num4)?res:num4;
//		System.out.println("Largest no is "+last);
	}
}
