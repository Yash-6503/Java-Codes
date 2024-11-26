//BLC class of TestCar

package com.blc;

public class Car
{
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine)
    {
        this.make = make;
        this.model = model;
        this.engine  = engine;
    }

    @Override 
    public String toString()
    {
        return "Car = [Car Make = "+make+", Model = "+model+", "+engine+"]";
    }
}