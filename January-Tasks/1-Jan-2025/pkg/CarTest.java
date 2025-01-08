//BLC class of CarUser -> CarTest.java

package pkg;

public class CarTest
{
	public static void stop(String stop)
	{
		if(stop.equalsIgnoreCase("stop")) {
			try {
				throw new CarStoppedException("Car stopped for some reason.");
			}catch(CarStoppedException e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Car not stopped.");
		}
	}
	
	public static void puncture(String puncture)
	{
		if(puncture.equalsIgnoreCase("puncture")) {
			try {
				throw new CarPunctureException("Car is punctured.");
			}catch(CarPunctureException e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Car is not punctured.");
		}
	}
	
	public static void carheat(int heat)
	{
		if(heat > 50) {
			try {
				throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
			}catch(CarHeatException e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Car temperature normal.");
		}
	}
}