/*
Program that demonstrates how to handle ArithmeticException.
*/

package com.classes;

import java.util.Scanner;

public class DivisionExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dividend : ");
		int dividend = sc.nextInt();
		
		System.out.println("Enter divisor : ");
		int divisor = sc.nextInt();
		
		try {
			System.out.println("Result of division: "+performDivision(dividend,divisor));
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
Enter dividend : 
10
Enter divisor : 
2
Result of division: 5
*/

/*
Enter dividend : 
5
Enter divisor : 
0
java.lang.ArithmeticException: / by zero
*/
