package com.java;

import java.util.Scanner;

public class Encap_Electicity {
	String name;
	int units;
	float amount;

		void user()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter customer name");
			String name = sc.nextLine();

			System.out.println("Enter units consumed");
		    int	units = sc.nextInt();
		    
		}

	void calculate()
	{
		if (units >= 0 && units <= 200) { // 0 to 200

			amount = units * 3.80f;
		}
		else if (units > 200 && units <= 300) {
			amount = 200 * 3.80f + (units - 200) * 4.40f;

		} else if (units > 300 && units <= 400) {
			amount = 200 * 3.80f + 100 * 4.40f + (units - 300) * 5.10f;
		} else {
			amount = 200 * 3.80f + 100 * 4.40f + 100 * 5.10f + (units - 400) * 5.80f;
		}
	}

	void display()
	{
		System.out.println("Product Name:" +name);
		System.out.println("price is: " +units);
		System.out.println("Amount to pay Rs. :" +amount);
	}
	
	

}
