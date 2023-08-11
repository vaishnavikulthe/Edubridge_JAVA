package com.java;

import java.util.Scanner;

public class VotingIfElse {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
		
		if(num>=18)
		{
			System.out.println("Eligible for Voting !!");
		}
		else {
			System.out.println("first you have to grow");
		}
	}
}
