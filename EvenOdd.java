package com.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nUmber");
		int num = sc.nextInt();

		System.out.println(num > 0 ? "pos" : "neg");
	}

}
