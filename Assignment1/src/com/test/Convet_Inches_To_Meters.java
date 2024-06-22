package com.test;

  //8) Write a Java program that reads a number in inches and converts it to meters

public class Convet_Inches_To_Meters {

	public static void main(String[] args)
	{
		int Inches = 40;  
		double meter;  
		meter = Inches / 39.37;    
		meter = Inches  * 0.0254;       //You have to use one formula for converting the value in Inches to the value in meter  
		
		System.out.println("Value in meters : " +meter);
		
    }
	
	
}
