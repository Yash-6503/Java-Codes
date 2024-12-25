/*
Program to find whether the age is Eligible for voting or not using Predicate function. 
*/

package com.classes;

import java.util.*;
import java.util.function.*;


public class VotingEligibilityUsingPredicate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		Predicate<Integer> p = Age -> Age >= 18;
		
		System.out.println("Age "+age+" is Eligible for Voting ? "+p.test(age));
	}

}

/*
Enter your Age: 
18
Age 18 is Eligible for Voting ? true
*/

/*
Enter your Age: 
10
Age 10 is Eligible for Voting ? false
*/