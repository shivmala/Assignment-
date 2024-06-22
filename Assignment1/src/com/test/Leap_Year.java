package com.test;

 // 12) Write a Java program that takes a year from the user and prints whether it is a leap year or not.

public class Leap_Year 
{
	public static void main(String[] args) {
	    int year = 2024;
	    int leapYear;

	    if( (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
        {
	      System.out.println(+year+ " is a Leap year");
	    } 
        else 
        {
	      System.out.println(+year+ " is not a Leap year");
	    }
	  }
}
