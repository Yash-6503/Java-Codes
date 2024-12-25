/*
Program to find a even number using Predicate functions 
*/

package com.classes;

import java.util.*;
import java.util.function.*;


public class EvenOddUsingPredicate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		Predicate<Integer> p = num -> num%2==0;
		System.out.println("Number "+number+" is a Even ? "+p.test(number));
		
	}
}

/*
Enter a number: 
15
Number 15 is a Even ? false
*/

/*
Enter a number: 
4
Number 4 is a Even ? true
*/
