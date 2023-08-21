package com.java;

import java.util.Scanner;

//1/1+1/2+1/3+......+1/n
public class Series 
{
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter No");
		double num=scanner.nextDouble();
		double sum=0;
		for(int i=1;i<num;i++)
		{
			sum=sum+(1.0/i);
		}
		System.out.println(sum);
	}

}
