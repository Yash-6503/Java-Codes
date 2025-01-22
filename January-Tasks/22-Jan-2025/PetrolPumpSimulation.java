/*
Program that simulates a scenario where multiple cars arrive  at a petrol pump for refilling. 
The program should utilize multithreading concepts with synchronization to manage concurrent refilling operations at the petrol pump. 
*/

// ELC (main) class of PetrolPump, Car -> PetrolPumpSimulation.java

package pkg;

public class PetrolPumpSimulation 
{
	public static void main(String[] args) {
		
        //Petrol pump object
		PetrolPump Reliance = new PetrolPump();
		
        //welcome message
		System.out.println("Welcome to Reliance PetroPump..\n");
		
        //Car array to hold car objects
		Car car[] = {
            new Car("Scorpio",Reliance),
            new Car("Thar",Reliance),
            new Car("Fortuner",Reliance),
            new Car("Pajero",Reliance),
            new Car("Swift",Reliance)
		};
		

		Thread thread[];                    //Thread decelaration/creation
		thread = new Thread[car.length];    //Thread initialization with size
		
        //using this method we can print randomly car filling petrol
		for(int i=0; i<thread.length; i++) {
			thread[i] = new Thread(car[i]);
			thread[i].start();
		}
		
        // This is thread array to store thread objects
//		Thread thread[] = {
//			new Thread(car[0]),
//			new Thread(car[1]),
//			new Thread(car[2]),
//			new Thread(car[3]),
//			new Thread(car[4])
//		};
		
		
        //This method is not working it throws nullpointer exception
//		int count=0;
//		for(Thread t : thread) {
//			t = new Thread(car[count]);
//			count++;
//		}
		
	
		//here if i take join method then all the cars are coming and filling petrol in sequence
		//if i don't take join() then all comes randomly.
//		
//		for(Thread t : thread) {
//			t.start();
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
//		try {
//			thread[0].start();
//			thread[0].join();
//			
//			thread[1].start();
//			thread[1].join();
//			
//			thread[2].start();
//			thread[2].join();
//			
//			thread[3].start();
//			thread[3].join();
//			
//			thread[4].start();
//			thread[4].join();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
        //using this method we can print randomly car filling petrol
//		for(int i=0; i<=thread.length-1; i++) {
//			thread[i].start();
//			try {
//				thread[i].join();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

	}
}


/* output 1
Welcome to Reliance PetroPump..

Scorpio started refilling...
Scorpio completed refilling!....

Swift started refilling...
Swift completed refilling!....

Fortuner started refilling...
Fortuner completed refilling!....

Pajero started refilling...
Pajero completed refilling!....

Thar started refilling...
Thar completed refilling!....
*/

/* output 2
Scorpio started refilling...
Scorpio completed refilling!....

Thar started refilling...
Thar completed refilling!....

Swift started refilling...
Swift completed refilling!....

Fortuner started refilling...
Fortuner completed refilling!....

Pajero started refilling...
Pajero completed refilling!....
*/