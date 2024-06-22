package com.test;

import java.util.Scanner;

// 9) Write a Java program to convert minutes into years and days.

public class Convert_Minutes_Into_Years_Days
{
  
	public static void main(String[] args)
  {
	  double minutesInYear = 60 * 24 * 365;
	  int min = 689000;    
      long years =  (long) (min / minutesInYear);
      int days = (int) (min / 60 / 24) % 365;

      System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
      
      
  }
}
