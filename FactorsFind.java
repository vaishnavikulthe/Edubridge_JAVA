package com.java;

import java.util.Scanner;

public class FactorsFind
{
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
			
		}
		
	}
}
