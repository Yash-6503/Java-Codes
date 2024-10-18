package com.dev.tools;

import com.dev.tools.Circle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius :");
		double radius = sc.nextDouble();
		
		String areaOfCircle = Circle.getAreaOfCircle(radius);	
		System.out.println(areaOfCircle);
		
		sc.close();
	
	}
}




