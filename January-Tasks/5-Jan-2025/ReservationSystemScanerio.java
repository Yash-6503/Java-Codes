/*
Develop a Java program for a simple seat reservation system using the ReservationSystem class.
This class involves two custom exceptions: a checked exception (SeatUnavailableException) and an unchecked exception
(InvalidReservationException). These exceptions are designed to handle different scenarios related to reserving seats.
*/

// package com.classes;

import java.util.*;

class SeatUnavailableException extends Exception
{
    public SeatUnavailableException(String message)
    {
        super(message);
    }
}

class InvalidReservationException extends RuntimeException
{
    public InvalidReservationException(String message)
    {
        super(message);
    }
}

class ReservationSystem
{
    private int availableSeats;

    public ReservationSystem(int availableSeats)
    {
        this.availableSeats = availableSeats;
    }

    public void reserveSeat(int numberOfSeats) throws SeatUnavailableException, InvalidReservationException
    {
        if(numberOfSeats > availableSeats)
        {
            throw new SeatUnavailableException("Seats are not available Requested Seats: "+numberOfSeats+" Available Seats: "+availableSeats);
        }
        else
        {
            availableSeats -= numberOfSeats;
            System.out.println(numberOfSeats+" Seats reserved successfully and Available Seats are: "+availableSeats);
        }
    }

    public void reserveSeatUnchecked(int numberOfSeats)
    {
        if(availableSeats <= 0 || numberOfSeats <= 0){
            throw new InvalidReservationException("Seats are not available");
        }
        try{
            reserveSeat(numberOfSeats);
        }catch(SeatUnavailableException e)
        {
            System.out.println(e.getMessage());
        }
    }
}


public class ReservationSystemScanerio
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of seats available: ");
        int availableSeats = sc.nextInt();

        ReservationSystem reservationSystem = new ReservationSystem(availableSeats);

        try{
            reservationSystem.reserveSeat(10);
            reservationSystem.reserveSeat(25);
            reservationSystem.reserveSeat(5);
        }catch(SeatUnavailableException e)
        {
            System.out.println(e.getMessage());
        }

        reservationSystem.reserveSeatUnchecked(10);
        reservationSystem.reserveSeatUnchecked(-5);
        reservationSystem.reserveSeatUnchecked(0);
    }
}

/*
Enter the number of seats available: 
30
10 Seats reserved successfully and Available Seats are: 20
Seats are not available Requested Seats: 25 Available Seats: 20
10 Seats reserved successfully and Available Seats are: 10
Exception in thread "main" InvalidReservationException: Seats are not available
        at ReservationSystem.reserveSeatUnchecked(ReservationSystemScanerio.java:46)
        at ReservationSystemScanerio.main(ReservationSystemScanerio.java:79)
*/