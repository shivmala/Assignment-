package com.array;

 // 8) Write a Java program to calculate sum of square of numbers divisible by 3 from an given array. the array is  'int[ ] values = {4, 6, 7, 2, 12, 9, 15};


public class Sum_Of_Square_Of_Numbers
{

	public static void main(String[] args) 
	{
		int[ ] values = {4, 6, 7, 2, 12, 9, 15};
		int sum=0;
		
		for(int i=0; i<=values.length-1; i++)
		{
			if(values[i] %3 == 0)
			{
				sum=sum+(values[i]*values[i]);
			}
		}
		System.out.println("sum of square of numbers divisible by 3 : " +sum);

	}

}
