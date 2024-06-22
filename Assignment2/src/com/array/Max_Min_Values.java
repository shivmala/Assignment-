package com.array;

import java.util.Arrays;

// 3) Write a Java program to find the maximum and minimum value from a given an array. array is 'int array[ ] = {45, 67, 98, 63, 59, 24, 48};


public class Max_Min_Values 
{

	public static void main(String[] args) 
	{
		int array[ ] = {45, 67, 98, 63, 59, 24, 48};
		Arrays.sort(array);
		
		System.out.println("Maximum Value = " +(array[array.length-1]));   // array[6]
		System.out.println("Maximum Value = " +array[0]);  
		

	}

}
