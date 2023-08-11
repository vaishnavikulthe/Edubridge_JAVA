package com.java;

import java.security.PublicKey;
import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No");
		int num1=scanner.nextInt();
		m1(num1);
	}
	public static int m1(int num1)
	{
		int sum=0;
		
		if(num1>0)
		{
			int rem=num1%10;
			
			 sum=sum+rem;
			num1/=10;
		}
		return sum;
		
	
	}
}
