package com.java;

import java.util.Scanner;

public class FactorialNo {
	int num;
	long fact;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
	}
	
	void findFactorial() {
		fact = 1;
		for(int i=num;i>=1;i--) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of a number = "+fact);
	}
    public static void main(String[] args) {
    	FactorialNo fobj = new FactorialNo();
    	fobj.input();
    	fobj.findFactorial();
    }
}
