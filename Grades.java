package com.java;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter grade");
		char grade=scanner.next().charAt(0);
		
		if(grade=='A' || grade=='a')
		{
			System.out.println("marks between 90 and 100");
		}
		else if(grade=='B' || grade=='b'){
			System.out.println("marks between 70 and 89");
			
		}
		else if(grade=='C' || grade=='c'){
			System.out.println("marks between 50 and 69");
			
		}
		else if(grade=='D' || grade=='d'){
			System.out.println("marks between 1 and 49");
			
		}
		else {
			System.out.println("Fail ");
		}
	}
}
