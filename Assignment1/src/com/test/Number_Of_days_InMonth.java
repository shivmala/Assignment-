package com.test;

 // 11) Write a Java program to find the number of days in a month.

public class Number_Of_days_InMonth 
{
	public static void main(String args[]){

        int month = 4;
        int year = 2012;
        
        
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        { 
        	System.out.println("Number of days is 31");
        }
        else if((month==2) && ((year%4==0) || ((year%100!=0)&&(year%400==0))))
        { 
        	System.out.println("Number of days is 29");
        }
        else if(month==2)
        { 
        	System.out.println("Number of days is 28");
        }
        else
        { 
        	System.out.println("Number of days is 30");
        }


    }
}
