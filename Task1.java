package com.java;

public class Task1 
{
	void triangle(int num){
		for(int i=1;i<=num;i++)
        {
            for(int j=num;j>0;j--)
            {
              if(j>i)
              {
            	  System.out.print(" ");
              }
              else
              {
            	  System.out.print(i+" ");
              }
            }
            System.out.println();
        }    
		System.out.println();
	}
	public static void main(String[] args) {
		int num1=3;
		int num2=2;
		int num3=4;
		
		Task1 task=new Task1();
		task.triangle(num1);
		task.triangle(num2);
		task.triangle(num3);
	}
}

