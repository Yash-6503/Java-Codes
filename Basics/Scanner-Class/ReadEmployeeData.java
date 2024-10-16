/*
Program to read Employee Data using Scanner class
*/

package com.classes;

import java.util.*;

public class ReadEmployeeData
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		int empid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Department: ");
		String dept = sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		float salary = sc.nextFloat();
        System.out.println("Employee Details are: ");
		System.out.println("Employee id: "+empid);
		System.out.println("Employee name: "+name);
		System.out.println("Employee department: "+dept);
		System.out.println("Employee Salary: "+salary);
	}
}

/*
Enter Employee id: 
101
Enter Employee Name: 
John Smith
Enter Employee Department: 
Computer
Enter Employee Salary: 
50000.00

Employee Details are:
Employee id: 101
Employee name: John Smith
Employee department: Computer
Employee Salary: 50000.0
*/