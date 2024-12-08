//Program to demonstrate the use of Method Overriding in booking a flight, hotel and activity.

package com.SetC1;

class Booking 
{
    String itemName;
    double itemPrice;

    public Booking(String itemName, double itemPrice)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void bookFlight(String airlines)
    {
        System.out.println("Flight Booked: " + itemName);
        System.out.println("Airline: " + airlines);
        System.out.println("Price: $" + itemPrice);
    }

    public void bookHotel(int numberOfNights)
    {
        System.out.println("Hotel Booked: " + itemName);
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Price: $" + itemPrice);    
    }
    public void bookActivity(String activityType)
    {
        System.out.println("Acitivity Booked: " + itemName);
        System.out.println("Activity Type: " + activityType);
        System.out.println("Price: $" + itemPrice);    
    }
}

class Flight extends Booking
{
    public Flight (String itemName, double itemPrice)
    {
        super(itemName,itemPrice);
    }

    @Override
    public void bookFlight(String airlines)
    {
        super.bookFlight(airlines);
    }

}

class Hotel extends Booking
{
    public Hotel(String itemName, double itemPrice)
    {
        super(itemName,itemPrice);
    }

    @Override
    public void bookHotel (int numberOfNights)
    {
        super.bookHotel(numberOfNights);
    }   
}

class Activity extends Booking
{
    public Activity(String itemName, double itemPrice)
    {
        super(itemName,itemPrice);
    }

    @Override
    public void bookActivity(String activityType)
    {
        super.bookActivity(activityType);
    }
}

public class MainBooking
{
    public static void main(String args[])
    {
        System.out.println("Flight Booking Details");
        Flight flight = new Flight("Round Trip to Paris", 500);
        flight.bookFlight("Air India");

        System.out.println("\nHotel Booking Details");
        Hotel hotel = new Hotel("Luxury Site", 200);
        hotel.bookHotel(5);

        System.out.println("\nActivity Booking Details");
        Activity act = new Activity("City Tour",50);
        act.bookActivity("Sightseeing");
    }
}

/*
Flight Booking Details
Flight Booked: Round Trip to Paris
Airline: Air India
Price: $500.0

Hotel Booking Details
Hotel Booked: Luxury Site
Number of Nights: 5
Price: $200.0

Activity Booking Details
Acitivity Booked: City Tour
Activity Type: Sightseeing
Price: $50.0
*/