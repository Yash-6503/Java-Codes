/*
Java program that simulates various car-related exceptions using custom exception classes 
(CarStopped, CarPuncture, CarHeat). The program should handle different scenarios and test cases using the
CarTest class and demonstrate exception handling through static methods.
*/

//ELC (main) class of CarTest, CarStoppedException, CarPunctureException, CarHeatException -> CarUser.java

package pkg;

import java.util.Scanner;

public class CarUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Input for Car stop: ");
		String stop = sc.nextLine();
		CarTest.stop(stop);
		
		System.out.println("\nEnter Input for Car Puncture: ");
		String punc = sc.nextLine();
		CarTest.puncture(punc);
		
		System.out.println("\nEnter Input for CarHeat Temp: ");
		int heat = sc.nextInt();
		CarTest.carheat(heat);
	}

}

/*  Tested with exception inputs
Enter Input for Car stop: 
stop
pkg.CarStoppedException: Car stopped for some reason.

Enter Input for Car Puncture: 
puncture
pkg.CarPunctureException: Car is punctured.

Enter Input for CarHeat Temp: 
70
pkg.CarHeatException: Car is heated more than 50 degrees Celsius.
*/

/*  Tested with normal inputs
Enter Input for Car stop: 
go
Car not stopped.

Enter Input for Car Puncture: 
move
Car is not punctured.

Enter Input for CarHeat Temp: 
40
Car temperature normal.
*/