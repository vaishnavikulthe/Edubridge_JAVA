package com.java;

import java.util.Scanner;

public class FibnociiSeries {
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
		int t1=0;
		int t2=1;
		int sum;
		for(int i=1;i<=num;i++)
		{
			sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.print(t1+" ");
		}
	}

}
