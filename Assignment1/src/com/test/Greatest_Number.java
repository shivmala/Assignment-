package com.test;
import java.util.Scanner;

// 10) Write a Java program that takes three numbers from the user and prints the greatest number.

public class Greatest_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter num1: ");
		   int num1 = sc.nextInt();
		   sc.nextLine();
		   
		   System.out.println("Enter num2: ");
		   int num2 = sc.nextInt();
		  
		   System.out.println("Enter num3: ");
		   int num3 = sc.nextInt();
		   
		   int temp= num1> num2 ? num1:num2;
		   int largest = num3>temp ? num3:temp;
			  
		 System.out.println("largest number is: " +largest);

	}

}
