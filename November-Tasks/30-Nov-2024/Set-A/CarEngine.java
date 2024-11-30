//ELC class of Car and Engine -> CarEngine.java

package pkg.blc2;

public class CarEngine
{
    public static void main(String args[])
    {
        Engine e1 = new Engine("V8");

        Car c1 = new Car("Mahindra","Scorpio",e1);

        c1.displayDetails();
        c1.startCar();
    }
}

/*
Car Brand: Mahindra, Model: Scorpio
Starting the car...
Engine of type V8 is starting...
*/