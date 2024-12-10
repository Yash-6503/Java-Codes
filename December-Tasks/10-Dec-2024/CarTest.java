//Program to create a abstract class Car with the following attributes and methods

package com.classes;

abstract class Car
{
    String brand;
    String model;
    int mileage;
    int top_speed;
    int yearOfManufacturing;

    public Car(){}

    public String carBrand(String brand){
        this.brand = brand;
        return brand;
    };

    public String carModel(String model){
        this.model = model;
        return model;
    };

    public int carMileage(int mileage){
        this.mileage = mileage;
        return mileage;
    };

    public int carTopSpeed(int top_speed){
        this.top_speed = top_speed;
        return top_speed;
    };
    
    public int carYear(int yearOfManufacturing){
        this.yearOfManufacturing = yearOfManufacturing;
        return yearOfManufacturing;
    };

    public abstract void display();
}

class Test extends Car
{
    
    @Override
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage);
        System.out.println("Top Speed: " + top_speed);
        System.out.println("Year of Manufacturing: " + yearOfManufacturing);
    }

}

public class CarTest 
{
    public static void main(String args[])
    {
        Test t = new Test();
        t.carBrand("Scorpio");
        t.carModel("S11");
        t.carMileage(20);
        t.carTopSpeed(200);
        t.carYear(2024);
        t.display();
    }
}


/*
Brand: Scorpio
Model: S11
Mileage: 20
Top Speed: 200
Year of Manufacturing: 2024
*/