/*
Write a program to verify the name using Predicate interface.
*/

package com.classes;

import java.util.Scanner;
import java.util.function.Predicate;

public class VerifyNameUsingPredicate 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		
		Predicate<String> p = str -> str.equalsIgnoreCase("Yash");
				
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Name "+name+" is matching ? "+p.test(name));
		
	}
}

/*
Enter your Name: 
YaSh
Name YaSh is matching ? true
*/

/*
Enter your Name: 
harsh
Name harsh is matching ? false
*/