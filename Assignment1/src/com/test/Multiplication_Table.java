package com.test;

  // 2) Write a Java program that takes a number as input and prints its multiplication table up to 10.

public class Multiplication_Table {

	public static void main(String[] args)
    {
       int num=1;
		
       for(int i=1; i<=10; i++)
       {
	    num*=i;
       }
       System.out.println("Multiplication of 10 numbers = " +num);
    }


}
