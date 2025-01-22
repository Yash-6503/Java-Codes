// BLC class of PetrolpumpSimulation -> Car.java

package pkg;

public class Car implements Runnable 
{
	private String name;
	PetrolPump petrolPump;
	
	public Car(String name, PetrolPump petrolPump) {
		this.name = name;
		this.petrolPump = petrolPump;
	}

	@Override
	public void run() 
	{
		petrolPump.refillCar(name);
	}

}
