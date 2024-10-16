/*
Read User Dataa using Scanner Class
*/

package com.classes;

import java.util.*;

public class ReadData
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Your Name is : "+name);
	}
}

/*
Enter your Name:
John Smith
Your Name is : John Smith
*/