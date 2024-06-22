package com.test;

 // 16) Write a simple Java program to calculate a Factorial of a number

public class Factorial_Number {

	public static void main(String[] args) 
	{

		int fact=1;
		int num=7;
		
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial number: " +fact);

	}

}
