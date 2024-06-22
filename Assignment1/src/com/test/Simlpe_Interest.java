package com.test;

// 13) Write a Java program to Calculate Simple Interest for a given amount, rate of interest and time duration.

public class Simlpe_Interest 
{
	public static void main (String args[])  
    {   
	     float amount=13000;
	     float rate=12;  
	     float time=2;
	     float  simlpeInterest; 
              
         simlpeInterest  = (amount*rate*time)/100;   
         System.out.println("Simple Interest is: " +simlpeInterest);  
    }
}
