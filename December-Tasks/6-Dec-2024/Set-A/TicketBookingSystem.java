//Program to create a ticket booking system for various modes of transportation.

package com.SetA1;

class Ticket 
{
	String source;
	String destination;
	double price;
	
	public Ticket(String source, String destination, double price)
	{
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	
	public void displayTicketDetails()
	{
		System.out.println("Source : "+source);
		System.out.println("Destination : "+destination);
		System.out.println("Price : "+price);
	}

}

class TrainTicket extends Ticket
{
	int trainNumber;
	
	public TrainTicket(String source, String destination, double price, int trainNumber)
	{
		super(source,destination,price);
		this.trainNumber = trainNumber;
	}
	
	@Override
	public void displayTicketDetails()
	{
		super.displayTicketDetails();
		System.out.println("Train Number : "+trainNumber);
	}
	
}

class BusTicket extends Ticket
{
	String busCompanyName;
	
	public BusTicket(String source, String destination, double price, String busCompanyName)
	{
		super(source,destination,price);
		this.busCompanyName = busCompanyName;
	}
	
	@Override
	public void displayTicketDetails()
	{
		super.displayTicketDetails();
		System.out.println("Bus Company Name : "+busCompanyName);
	}
}

class FlightTicket extends Ticket 
{
	String flightNumber;
	
	public FlightTicket(String source, String destination, double price, String flightNumber)
	{
		super(source,destination,price);
		this.flightNumber = flightNumber;
	}
	
	@Override
	public void displayTicketDetails()
	{
		super.displayTicketDetails();
		System.out.println("Flight Number : "+flightNumber);
	}
}


public class TicketBookingSystem {

	public static void main(String[] args) 
	{

		System.out.println("Trian Ticket Details");
		TrainTicket train = new TrainTicket("City A","City B",50,123);
		train.displayTicketDetails();
		
		System.out.println("\nBus Ticket Details");
		BusTicket bus = new BusTicket("City X","City Y",30,"XYZ Bus Company");
		bus.displayTicketDetails();
		
		System.out.println("\nFlight Ticket Details");
		FlightTicket flight = new FlightTicket("City P","City Q",200,"ABC123");
		flight.displayTicketDetails();
	}

}

/*
Trian Ticket Details
Source : City A
Destination : City B
Price : 50.0
Train Number : 123

Bus Ticket Details
Source : City X
Destination : City Y
Price : 30.0
Bus Company Name : XYZ Bus Company

Flight Ticket Details
Source : City P
Destination : City Q
Price : 200.0
Flight Number : ABC123
*/