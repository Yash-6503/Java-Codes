//ELC (main) class of Airtel,BSNL,Jio,MobilePhone -> MoblieSimTest.java

/*
Program to create a system where mobile phones can insert, remove, and use SIM cards from different providers.
*/

package pkg.blc1;

import java.util.*;

public class MoblieSimTest {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		Jio jio = new Jio();
		Airtel airtel = new Airtel();
		BSNL bsnl = new BSNL();
		
		MobilePhone mobile = new MobilePhone();
		
		int ch, choice;
		
		do {
			System.out.println("\nMoblie Sim Operations");
			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.Make Call");
			System.out.println("4.Send Message");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				//Insert
				case 1:
					System.out.println("Select Sim Card");
					System.out.println("1.JIO");
					System.out.println("2.AIRTEL");
					System.out.println("3.BSNL");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch(ch)
					{
						case 1:	
							mobile.insertSim(jio);
							break;
						
						case 2:
							mobile.insertSim(airtel);
							break;
						
						case 3:
							mobile.insertSim(bsnl);
							break;
						
						default:
							System.out.println("Invalid Sim Choice");
					}
					break;
					
				//Remove
				case 2:
					System.out.println("Select Sim Card");
					System.out.println("1.JIO");
					System.out.println("2.AIRTEL");
					System.out.println("3.BSNL");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch(ch)
					{
						case 1:
							mobile.removeSim(jio);
							break;
						
						case 2:
							mobile.removeSim(airtel);
							break;
						
						case 3:
							mobile.removeSim(bsnl);
							break;
						
						default:
							System.out.println("Invalid Sim Choice");
					}
					break;
					
				//Make Calls
				case 3:
					System.out.println("Select Sim Card");
					System.out.println("1.JIO");
					System.out.println("2.AIRTEL");
					System.out.println("3.BSNL");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch(ch)
					{
						case 1:
							mobile.makeCalls(jio);
							break;
						
						case 2:
							mobile.makeCalls(airtel);
							break;
						
						case 3:
							mobile.makeCalls(bsnl);
							break;
						
						default:
							System.out.println("Invalid Sim Choice");
					}
					break;
					
				//Send Message
				case 4:
					System.out.println("Select Sim Card");
					System.out.println("1.JIO");
					System.out.println("2.AIRTEL");
					System.out.println("3.BSNL");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch(ch)
					{
						case 1:
							mobile.sendMessages(jio);
							break;
						
						case 2:
							mobile.sendMessages(airtel);
							break;
						
						case 3:
							mobile.sendMessages(bsnl);
							break;
						
						default:
							System.out.println("Invalid Sim Choice");
					}
					break;
					
				//Exit
				case 5:
					System.exit(0);
					
				default:
					System.out.println("Inavlid Operation Selected");
					
			}
		}while(choice != 5);
		
	}
}

/* Output:
Moblie Sim Operations
1.Insert
2.Remove
3.Make Call
4.Send Message
5.Exit
Enter your choice: 
1
Select Sim Card
1.JIO
2.AIRTEL
3.BSNL
Enter your choice: 
1

Sim card inserted in your Mobile
Network Provider: Jio
Mobile Number: 9038686191
Activation Status: Active

Moblie Sim Operations
1.Insert
2.Remove
3.Make Call
4.Send Message
5.Exit
Enter your choice:
2
Select Sim Card
1.JIO
2.AIRTEL
3.BSNL
Enter your choice:
2

Airtel Sim card removed from your mobile

Moblie Sim Operations
1.Insert
2.Remove
3.Make Call
4.Send Message
5.Exit
Enter your choice:
3
Select Sim Card
1.JIO
2.AIRTEL
3.BSNL
Enter your choice:
3

Making Call from BSNL Sim

Moblie Sim Operations
1.Insert
2.Remove
3.Make Call
4.Send Message
5.Exit
Enter your choice:
4
Select Sim Card
1.JIO
2.AIRTEL
3.BSNL
Enter your choice:
2

Sending Message from Airtel Sim

Moblie Sim Operations
1.Insert
2.Remove
3.Make Call
4.Send Message
5.Exit
Enter your choice:
5
*/