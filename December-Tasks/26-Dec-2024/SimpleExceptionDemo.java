/*
Program to create a simple exception of InputMismatchException and handle it.
*/

package com.classes;

import java.util.*;

public class SimpleExceptionDemo 
{
	public static void main(String[] args) 
	{
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a value: ");
			int a=sc.nextInt();
			
			System.out.println("Enter b value: ");
			int b = sc.nextInt();
			
			System.out.println("You entered a = "+a+" and b = "+b);
			
		}catch(Exception e) {
			System.out.println("An InputMismatchException occurred.");
			System.out.println("\nMessage: "+e.getMessage());
			System.out.println("\nString Representation: "+e);
			
			System.out.println("\nStack Trace:");
			e.printStackTrace();	
		}
	
	}
}

/*
Enter a value: 
10
Enter b value: 
20
You entered a = 10 and b = 20 
*/

/*
Enter a value: 
10
Enter b value: 
abc
An InputMismatchException occurred.

Message: null

String Representation: java.util.InputMismatchException

Stack Trace:
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
	at java.base/java.util.Scanner.next(Scanner.java:1602)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
	at Tasks/com.Dec_26_Tasks.SimpleExceptionDemo.main(SimpleExceptionDemo.java:16)
*/
