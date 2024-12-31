/*
Write a program to accept two numbers from the command line and perform division operation on them.
*/

package com.classes;

public class CommandLineDivision 
{
	public static void main(String args[]) 
	{		
		if(args.length == 2) {
			try {
				int dividend = Integer.parseInt(args[0]);
				int divisor = Integer.parseInt(args[1]);
				
				try {
					double result = dividend/divisor;
					System.out.println("Result = "+result);	
				}catch(ArithmeticException e) {
					System.out.println(e);
				}
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("Division operation completed.");
			}
		}else {
			System.out.println("Enter only two arguments.");
		}
				
	}

}

/*
java CommandLineDivision.java 10 2 
Result = 5.0
Division operation completed.
*/

/*
java CommandLineDivision.java 8 0 
java.lang.ArithmeticException: / by zero
Division operation completed.
*/

/*
java CommandLineDivision.java 12 abc
java.lang.NumberFormatException: For input string: "abc"
Division operation completed.
*/