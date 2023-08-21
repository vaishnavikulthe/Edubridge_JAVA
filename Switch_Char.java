package com.java;

import java.util.Scanner;

public class Switch_Char {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u': System.out.println(ch+" is an Vowel");
		            break;
		 default: System.out.println("not a vowel");
			
		}
	}

}
