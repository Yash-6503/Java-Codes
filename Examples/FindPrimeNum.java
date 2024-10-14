/*Program to Find whether a number is prime or not using CMD*/

package com.classes;

public class FindPrimeNum
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		
		int count = 0;

		for(int i = 1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
        /* //Using if-else
		if(count == 2)
		{
			System.out.println(num+" is a Prime Number");
		}else{
			System.out.println(num+" is not a Prime Number");
		}
        */

        //using ternary operator
        System.out.println(count == 2 ? num+" is a Prime Number" : num+" is not a Prime Number");
	}
}

/*
java FindPrimeNum.java 3
3 is a Prime Number

java FindPrimeNum.java 8
8 is not a Prime Number
*/