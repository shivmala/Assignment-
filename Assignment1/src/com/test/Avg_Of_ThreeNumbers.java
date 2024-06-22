package com.test;

import java.util.Scanner;

// 4) Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


public class Avg_Of_ThreeNumbers 
{
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
	  
	   int avg;
	   
	   avg=(num1+num2+num3)/3;
	   System.out.println("Average of 3 numbers: " +avg);
	   

  }
}
