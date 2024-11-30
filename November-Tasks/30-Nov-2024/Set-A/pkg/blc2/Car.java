//BLC class of CarEngine -> Car.java

package pkg.blc2;

public class Car
{
    String brand;
    String model;
    Engine engine;

    public Car(String brand, String model, Engine engine)
    {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void displayDetails()
    {
        System.out.println("Car Brand: " + brand + ", Model: " + model);
    }

    public void startCar()
    {
        System.out.println("Starting the car...");
        engine.startEngine();
    }
}
