package com.classes;

class Vehicle
{
	protected String make;
	protected String model;
	protected int year;
	
	Vehicle(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails()
	{
		System.out.println("Make = "+make);
		System.out.println("Model = "+model);
		if(year <= 0) {			
			System.err.println("Error Invalid Input");
		}else {
			System.out.println("Year = "+year);
		}
	}
}

class Car extends Vehicle
{
	protected int numberOfDoors;
	Car(String make, String model, int year, int numberOfDoors)
	{
		super(make,model,year);
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		if(numberOfDoors <= 0) {			
			System.err.println("Error Invalid Input");
		}else {
			System.out.println("Number of Doors = "+numberOfDoors);
		}
	}
}


class Bike extends Vehicle
{
	protected String type;
	
	Bike(String make, String model, int year, String type)
	{
		super(make,model,year);
		this.type = type;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Type = "+type);
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
		Car car = new Car("Audi", "Q8", 0, 4);
        System.out.println("Car Details:");
        car.displayDetails();

        Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
        System.out.println("\nBike Details:");
        bike.displayDetails();		
	}
	
}

/*
Car Details:
Make = Audi
Model = Q8
Year = 2020
Number of Doors = 4

Bike Details:
Make = Yamaha
Model = MT-07
Year = 2020
Type = Sports
*/
