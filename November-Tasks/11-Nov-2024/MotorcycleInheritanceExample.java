//Q2

package com.classes;

class Vehicle           //Grandparent Class
{       
    protected String brand;
    protected int year;
    Vehicle(String brand, int year)
    {
        this.brand = brand;
        this.year = year;
    }

    public void displayVehicleDetails()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Year : "+year);
    }
}

class Motorcycle extends Vehicle            //Parent Class
{
    protected int engineCapacity;
    Motorcycle(String brand, int year, int engineCapacity)
    {
        super(brand,year);
        this.engineCapacity = engineCapacity;
    }

    public void startEngine()               //#1
    {   
        System.out.println("Starting engine with capacity: " + engineCapacity + " cc");
    }
}

class SportMotorcycle extends Motorcycle        //Child Class
{
    private boolean raceMode;
    SportMotorcycle(String brand, int year, int engineCapacity, boolean raceMode)
    {
        super(brand,year,engineCapacity);
        this.raceMode = raceMode;
    }

    public void activateRaceMode()          //#2
    {
        System.out.println(raceMode ? "Race Mode is On Now...." : "Race Mode is Off...");
    }

    public void displaySportMotorcycleDetails()         //#3
    {
        displayVehicleDetails();
        System.out.println("Engine Capacity : "+engineCapacity+" cc");
        System.out.println("Race Mode : "+ (raceMode ? "On" : "Off"));
    }
}

public class MotorcycleInheritanceExample
{
    public static void main(String args[])
    {
        SportMotorcycle s = new SportMotorcycle("Ducati",2023,1200,true);

        s.startEngine();

        s.activateRaceMode();

        System.out.println("\nSport Motorcycle Details:");
        s.displaySportMotorcycleDetails();
    }
}

/* if race mode is On (true)
Starting engine with capacity: 1200 cc
Race Mode is On Now....

Sport Motorcycle Details:
Brand : Ducati
Year : 2023
Engine Capacity : 1200 cc
Race Mode : On
*/

/* if race mode is Off (false)
Starting engine with capacity: 1200 cc
Race Mode is Off...

Sport Motorcycle Details:
Brand : Ducati
Year : 2023
Engine Capacity : 1200 cc
Race Mode : Off
*/