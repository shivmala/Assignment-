package com.test;

 // 7) Write a Java program to swap two variables.

public class Swap_Variables 
{
    
	   public static void main(String[] args) 
	   {
	       int a=12;
	       int b=30;
		  
	       a=a+b;
	       b=a-b;
	       a=a-b;
		  
	       System.out.println("After Swapping: ");
	       System.out.println("a= " +a);
	       System.out.println("b= " +b);
		  
	   }

}
