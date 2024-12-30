/*
Program that demonstrates how to handle ArithmeticException.
*/

package com.classes;

public class DivisionExample
{
	public static void main(String[] args) 
	{
		try {
			System.out.println(performDivision(12, 2));
			System.out.println(performDivision(12, 0));
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	
	
	public static int performDivision(int a, int b)
	{
		return a/b;
	}

}

/*
6 
java.lang.ArithmeticException: / by zero
*/
