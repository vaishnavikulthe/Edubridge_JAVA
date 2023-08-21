package com.java;

import java.util.Scanner;

public class Switch_day {
	 public static void main(String args[]){    
		    int day;
		    Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the day number");
		        day = sc.nextInt();
		   
		    switch(day){
		  
		   case 1:  System.out.println("Monday,First day of the week");
		               break;
		     case 2:  System.out.println("Tuesday,Second day of the week");
		                break;
		     case 3:  System.out.println("Wednesday,Third day of the week");
		                break;
		     case 4:  System.out.println("Thursday, Fourth day of the week");
		                break;
		      case 5:  System.out.println("Friday ,Fifth day of the week");
		                break;
		     case 6:  System.out.println("Saturday, Sixth day of the week");
		                break;
		    case 7:  System.out.println("Sunday, Seventh day of the week");
		                  break;
		    default: System.out.println("Invalid Input");
		  }
		}

}
