/*
2)
create base class Vehicle 
with its attributes
String brand
int year

methods:-

return type :- void
method Name :- start
behavior of start method:- this method will print the message that " The vehicle is starting."
------
create derived class name as car inherit from vehicle

Attribute:-

String model


methods:-

return type :- void
method Name :- displayCarDetails
behavior of displayCarDetails method:- this method will print the brand, year,model

------
create main class to test your logic 
create object initialize the values and call the methods
*/

package com.classes;

class Vehicle
{
    String brand;
    int year;
    public Vehicle(String brand, int year)
    {
        this.brand = brand;
        this.year = year;
    }

    void start()
    {
        System.out.println("The Vehicle is Starting.");
    }
}

class Car extends Vehicle
{
    String model;
    public Car(String brand, int year, String model)
    {
        super(brand, year);
        this.model = model;
    }

    void displayCarDetails()
    {
       System.out.println("Brand = "+brand+", Year = "+year+", Model = "+model);
    }
}

public class Example2
{
    public static void main(String args[])
    {
        Car c = new Car("Mahindra",2020,"Thar");
        c.displayCarDetails();
        c.start();
    }
}

/*
Brand = Mahindra, Year = 2020, Model = Thar
The Vehicle is Starting.
*/