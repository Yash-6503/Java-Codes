//ELC class of TestCar

package com.blc;

public class TestCar
{
    public static void main(String args[])
    {
        Engine e1 = new Engine("V6 Hybrid");
        Car c1 = new Car("Hyundai", "Camry", e1);

        System.out.println(c1);
    }
}

/*
Car = [Car Name = Tata Motors, Car Model = Nexon-2020, Engine = [Engine Model = Nexon-1200HP]]
*/

/*
Car = [Car Make = Hyundai, Model = Camry, Engine Model = V6 Hybrid]
*/

