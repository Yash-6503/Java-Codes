package com.classes;

//Ticket Management System with VIP and Student Tickets

class Ticket 
{
	private String eventName;
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName, int seatNumber, double price)
	{
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	
	public String getEventName()
	{
		return eventName;
	}
	
	public int getSeatNumber()
	{
		if(seatNumber > 0) {			
			return seatNumber;
		}else {
			return -1;
		}
	}
	
	public double getPrice()
	{
		return price;
	}
	
}

class VIPTicket extends Ticket 
{
	private String specialAccess;
	
	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess)
	{
		super(eventName,seatNumber,price);
		this.specialAccess = specialAccess;
	}
	
	public String getSpecialAccess()
	{
		return specialAccess;
	}

}

class StudentTicket extends Ticket 
{
	private boolean studentDiscount;
	
	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount)
	{
		super(eventName,seatNumber,price);
		this.studentDiscount = studentDiscount;
	}
	
	public boolean getStudentDiscount()
	{
		return studentDiscount;
	}
	
}


public class Example2 
{

	public static void main(String[] args)
	{
		Ticket regularTicket = new Ticket("Concert", 101, 50.0);
        VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
        
        System.out.println("Regular Ticket");
        System.out.println("Event : "+regularTicket.getEventName());
        System.out.println(regularTicket.getSeatNumber() <= 0 ? "Error Invalid Input" : "Seat Number : "+regularTicket.getSeatNumber());
        System.out.println(regularTicket.getPrice() <= 0 ? "Error Invalid Input" : "Price : $"+regularTicket.getPrice());
        
        System.out.println("\nVIP Ticket");
        System.out.println("Event : "+vipTicket.getEventName());
        System.out.println(vipTicket.getSeatNumber() <= 0 ? "Error Invalid Input" : "Seat Number : "+vipTicket.getSeatNumber());
        System.out.println(vipTicket.getPrice() <= 0 ? "Error Invalid Input" : "Price : $"+vipTicket.getPrice());
        System.out.println("Special Access : "+vipTicket.getSpecialAccess());

        System.out.println("\nStudent Ticket");
        System.out.println("Event : "+studentTicket.getEventName());
        System.out.println(studentTicket.getSeatNumber() <= 0 ? "Error Invalid Input" : "Seat Number : "+studentTicket.getSeatNumber());
        System.out.println(studentTicket.getPrice() <= 0 ? "Error Invalid Input" : "Price : $"+studentTicket.getPrice());
        System.out.println("Student Discount : "+studentTicket.getStudentDiscount());
	}

}

/*
Regular Ticket
Event : Concert
Seat Number : 101
Price : $50.0

VIP Ticket
Event : VIP Concert
Seat Number : 201
Price : $100.0
Special Access : Backstage Access

Student Ticket
Event : Student Event
Seat Number : 301
Price : $30.0
Student Discount : true
 */
