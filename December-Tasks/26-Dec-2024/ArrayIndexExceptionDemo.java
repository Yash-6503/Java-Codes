/*
Write a program to demonstrate ArrayIndexOutOfBoundsException.
*/

package com.classes;

import java.util.Scanner;

public class ArrayIndexExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[2];
		
		try {
			//Input Optional taken for checking purpose
			System.out.println("Enter 2 elements in array: ");
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");
			System.out.println("Message: "+e.getMessage());
			System.out.println("String Representation: "+e);
			System.out.println("Stack Trace: ");
			e.printStackTrace();
		}
	}

}

/*
An ArrayIndexOutOfBoundsException occurred.
Message: Index 3 out of bounds for length 2
String Representation: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
Stack Trace: 
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
	at Tasks/com.Dec_26_Tasks.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:10)
*/

/*
Enter 2 elements in array: 
1 2
An ArrayIndexOutOfBoundsException occurred.
Message: Index 3 out of bounds for length 2
String Representation: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
Stack Trace: 
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
	at Tasks/com.Dec_26_Tasks.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:16)
*/
