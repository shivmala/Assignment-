package com.test;

// 5) Write a Java program to print the area and perimeter of a rectangle

public class Area_Perimeter_Of_Rectangle {

	public static void main(String[] args) 
    {
    	double width = 5.6;
        double height = 8.5;
        
        double area = width * height;		
        double perimeter = 2 * (height + width);
        
        System.out.println("Area of Rectangle: " +area);
        System.out.println("Perimeter of Rectangle: " +perimeter);
        
	}


}
