package com.array;

 // 2) Write a Java program to calculate the average value of array elements. the array is 'int array[ ] = {55, 66, 44, 22, 55, 77};


public class Avgerage_Value_Of_Array 
{

	public static void main(String[] args) 
	{
		int array[ ] = {55, 66, 44, 22, 55, 77};
		int sum=0;
		double avg = 0;
		
		for(int i=0; i<=array.length-1; i++)
		{
			sum=sum+array[i];
			
		}
		avg=sum/array.length;
		
		System.out.println(avg);
    }


}
