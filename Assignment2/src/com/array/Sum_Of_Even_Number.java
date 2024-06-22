package com.array;

 // 5) Write a Java program to calculate sum of even numbers from an given array. the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};


public class Sum_Of_Even_Number 
{

	public static void main(String[] args) 
	{
		int[ ] values = {4, 6, 7, 2, 13, 9, 5};
		int sum=0;
		
		for(int i=0; i<=values.length-1; i++)
		{
			if(values[i]%2 == 0)
			{
				sum=sum+values[i];	
			}
			
		}
		System.out.println("Sum of Even number : " +sum);
	}

}
