package com.array;

 // 4) Write a Java program to find duplicate values in an array values, the array is 'int values[ ] = {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34};


public class Duplicate_Values 
{

	public static void main(String[] args)
	{
		int values[ ] = {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34};
		
		System.out.println("Duplicate values are : ");
		
		for(int i=0; i<=values.length-1; i++)
		{
			for(int j=i+1; j<=values.length-1; j++)
			{
				if(values[i]==values[j])
				{
					System.out.println(values[i]);	
				}
				
			}
		}
	}

}
