package com.classes;

class Circle
{
	protected double radius;
	protected double pi = 3.14;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		if(radius >= 0) {
			return pi * radius * radius;
		}else {
			return -1;
		}
	}
}


class Cylinder extends Circle
{
	protected double height;
	Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	
	public double getVolume()
	{
		if(height >= 0) {
			return pi * (radius * radius) * height;
		}else {
			return -1;
		}
	}
}
 

public class Example3 
{
	public static void main(String[] args) {
		
		Cylinder c = new Cylinder(5,5);
		
		if(c.getArea() > 0)
		{
			System.out.println("Area of Circle is = "+c.getArea());
		}else {
			System.err.println("Error Invalid Input");
		}
		
		if(c.getVolume() > 0)
		{
			System.out.println("Volume of Cylinder is = "+c.getVolume());
		}else {
			System.err.println("Error Invalid Input");
		}

	}
}

/*
Area of Circle is = 78.5
Volume of Cylinder is = 392.5
*/