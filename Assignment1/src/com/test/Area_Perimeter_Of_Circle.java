package com.test;

// 3) Write a Java program to print the area and perimeter of a circle. :  area=Math.PI*(radius*radius)


public class Area_Perimeter_Of_Circle {

	public static void main(String[] args) 
	{
		double area;
		int radius=5;
		double perimeter;
		
		area=Math.PI*(radius*radius);
		System.out.println("Area of circle: " +area);
		
		perimeter=2*Math.PI*radius;
		System.out.println("Perimeter of circle: " +perimeter);

		
	}

}
