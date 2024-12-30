/*
Program that calculates the area of a rectangle. Implement exception handling to throw and 
catch an IllegalArgumentException if the dimensions are not positive.
*/

package com.classes;

import java.util.Scanner;

public class AreaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle: ");
		double length = sc.nextDouble();
		
		System.out.println("Enter width of rectangle: ");
		double width = sc.nextDouble();
		
		try {
			System.out.println("Area of rectangle with length "+length+" and width "+width+" is: "+calculateArea(length,width));
		}catch(IllegalArgumentException e) {			
			System.err.println("IllegalArgumentException caught: Dimensions must be positive: length = "+length+", breadth = "+width);
		}
	}
	
	public static double calculateArea(double length, double width)
	{
		if(length > 0 && width > 0) {
			return length * width;
		}else {
			throw new IllegalArgumentException();
		}
	}
}

/* Tested with Valid Input
Enter length of rectangle: 
5
Enter width of rectangle: 
4
Area of rectangle with length 5.0 and width 4.0 is: 20.0
*/

/*  Tested with Invalid Input
Enter length of rectangle: 
-3
Enter width of rectangle: 
6
IllegalArgumentException caught: Dimensions must be positive: length = -3.0, breadth = 6.0
*/