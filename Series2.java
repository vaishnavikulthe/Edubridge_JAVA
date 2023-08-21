package com.java;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter No");
		double num=scanner.nextDouble();
		double sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+(1.0/i);
			}
			else
			{
				sum=sum-(1.0/i);
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
