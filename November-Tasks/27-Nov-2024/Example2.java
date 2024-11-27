// Que 2 : Change The Driver

package pkg.blc;

public class Example2
{
	public static void main(String args[])
	{
		Driver driver1 = new Driver("John",37);

		Car car1 = new Car("Mahindra","THAR-2020",2020,driver1);

		//copy
		Car carCopy = new Car(car1);

		System.out.println("Original Car Details:");
        car1.printDetails();

        System.out.println("\nCopied Car Details:");
        carCopy.printDetails();

        // Change the driver of the original car
        Driver driver2 = new Driver("Logan", 35);
        car1.changeDriver(driver2);

        System.out.println("\nOriginal Car Details after Changing Driver:");
        car1.printDetails();

        System.out.println("\nCopied Car Details after Changing Driver in Original Car:");
        carCopy.printDetails();
	}
}

/*
Original Car Details:
Car Brand : Mahindra
Car Model : THAR-2020
Car Year : 2020
Driver Name : John
Driver Age : 35

Copied Car Details:
Car Brand : Mahindra
Car Model : THAR-2020
Car Year : 2020
Driver Name : John
Driver Age : 35

Original Car Details after Changing Driver:   
Car Brand : Mahindra
Car Model : THAR-2020
Car Year : 2020
Driver Name : Logan
Driver Age : 35

Copied Car Details after Changing Driver in Original Car:
Car Brand : Mahindra
Car Model : THAR-2020
Car Year : 2020
Driver Name : John
Driver Age : 35
*/