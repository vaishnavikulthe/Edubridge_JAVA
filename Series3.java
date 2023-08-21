package com.java;

import java.util.Scanner;

public class Series3 {
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter No");
		double num=scanner.nextDouble();
		double sum=0;
		for(int i=1;i<num;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
				
			}
			sum=sum+(1.0/fact);
		}
		System.out.println(sum);
	}


}
