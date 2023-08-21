package com.java;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Switch_AreaOf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\nEnter the choices : \n1. Circle\n2. Rectangle\n3. Trainagle\n4. Square\n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter length for rectangle");
				double radius = scanner.nextDouble();
				double area = 3.14 * (radius * radius);
				System.out.println("Area of Circle is : " + area);
				break;
			}
			case 2: {
				System.out.println("Enter length for rectangle");
				double length = scanner.nextDouble();
				System.out.println("Enter Breadth for rectangle");
				double breadth = scanner.nextDouble();

				double area = length * breadth;
				System.out.println("Area of Circle is : " + area);
				break;
			}
			case 3: {
				System.out.println("Enter base for traingle");
				double base = scanner.nextDouble();
				System.out.println("Enter height for traingle");
				double height = scanner.nextDouble();

				double area = (base * height) / 2;
				System.out.println("Area of Traingle : " + area);
				break;

			}
			case 4: {
				System.out.println("Enter side for square :");
				double no = scanner.nextDouble();
				double area = no * no;
				System.out.println("Area of Square is : " + area);
				break;
			}
			}
		} catch (Exception e) {
			System.err.println("Plz Enter number data type dont use String here");
		}
	}

}
