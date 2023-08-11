package com.java;

import java.util.Scanner;

public class PositivieNegative {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive No");
		}
		else {
			System.out.println("Negative No");
		}
	}
}
