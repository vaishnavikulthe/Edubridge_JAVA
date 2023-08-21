package com.java;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
//		int count=0;
//		
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		boolean flag=true;
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		
		if(flag)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not Prime No");
		}
	}

}
