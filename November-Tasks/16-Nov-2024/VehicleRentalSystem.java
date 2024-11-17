// Vehicle Rental System

package com.classes;

class Vehicle 
{
	private String vehicleType;
	private String licensePlate;
	private double rentalPrice;
	
	public Vehicle(String vehicleType, String licensePlate, double rentalPrice)
	{
		this.vehicleType = vehicleType;
		this.licensePlate = licensePlate;
		this.rentalPrice = rentalPrice;
	}
	
	public String getVehicleType()
	{
		return vehicleType;
	}
	
	public String getLicensePlate()
	{
		return licensePlate;
	}
	
	public double getRentalPrice()
	{
		if(rentalPrice > 0) {
			return rentalPrice;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		if(getRentalPrice() == -1)
		{
			return "Invalid Input Rental Price";
		}else {
			return "Vehicle [Type : " + getVehicleType() + ", License Plate : " + getLicensePlate()
				+ ", Rental Price : $" + getRentalPrice() + "]";
		}
	}	
}

class Car extends Vehicle 
{
	private String fuelType;
	
	public Car(String vehicleType, String licensePlate, double rentalPrice, String fuelType)
	{
		super(vehicleType,licensePlate,rentalPrice);
		this.fuelType = fuelType;
	}
	
	public String getFuelType()
	{
		return fuelType;
	}

	@Override
	
	public String toString() {
		if(getRentalPrice() == -1)
		{
			return "Invalid Input Rental Price";
		}else {
			return "Car [Type : " + getVehicleType() + ", License Plate : " + getLicensePlate() + ", Rental Price : $" + getRentalPrice() + 
				", Fuel Type : " + getFuelType() + "]";
		}
	}
}

class Bike extends Vehicle 
{
	private boolean hasGear;
	
	public Bike(String vehicleType, String licensePlate, double rentalPrice, boolean hasGear)
	{
		super(vehicleType,licensePlate,rentalPrice);
		this.hasGear = hasGear;
	}
	
	public boolean getHasGear()
	{
		return hasGear;
	}
	
	@Override
	public String toString() {
		if(getRentalPrice() == -1)
		{
			return "Invalid Input Rental Price";
		}else {
			return "Bike [Type : " + getVehicleType() + ", License Plate : " + getLicensePlate() + ", Rental Price : $" + getRentalPrice() + 
				", Has Gear : " + getHasGear() + "]";
		}
	}
}


public class VehicleRentalSystem 
{
	public static void main(String[] args) 
	{
		Car car = new Car("Car", "ABC123", 200.0, "Petrol");  
		Bike bike = new Bike("Bike", "XYZ456", 100.0, true);  
		
		System.out.println(car);
		System.out.println();
		System.out.println(bike);
	}

}

/* Tested with Positive Values
Car [Type : Car, License Plate : ABC123, Rental Price : $200.0, Fuel Type : Petrol]

Bike [Type : Bike, License Plate : XYZ456, Rental Price : $100.0, Has Gear : true]
*/

/* Tested with Negative Values
Invalid Input Rental Price

Bike [Type : Bike, License Plate : XYZ456, Rental Price : $100.0, Has Gear : true]
*/