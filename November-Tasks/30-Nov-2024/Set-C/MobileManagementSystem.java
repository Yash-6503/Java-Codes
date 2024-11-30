//ELC class of Mobile, SIMCard -> MobileManagementSystem.java

package pkg.blc3;

public class MobileManagementSystem 
{
	public static void main(String[] args) 
	{
		SIMCard sim1 = new SIMCard("Jio","9067987261");
		Mobile mob1 = new Mobile("Samsung","A14",2024,sim1);
		
		//copy
		Mobile mobCopy = new Mobile(mob1);
		
		System.out.println("Original Mobile & Sim Details");
		System.out.println(mob1.displayDetails());
		
		System.out.println("\nCopied Mobile & SIM Details");
		System.out.println(mobCopy.displayDetails());
		
		SIMCard sim2 = new SIMCard("Airtel","9928176719");
		mob1.changeSim(sim2);
		
		System.out.println("\nMobile Details After Changing SimCard");
		System.out.println(mob1.displayDetails());
		
		
		System.out.println("\nCopied Mobile & SIM Details After Changing SimCard");
		System.out.println(mobCopy.displayDetails());
	}
}






/*
Original Mobile & Sim Details
Sim Name : Jio, Sim Number : 9067987261, Mobile Brand : Samsung, Model : A14, Release Year : 2024

Copied Mobile & SIM Details
Sim Name : Jio, Sim Number : 9067987261, Mobile Brand : Samsung, Model : A14, Release Year : 2024

Mobile Details After Changing SimCard
Sim Name : Airtel, Sim Number : 9928176719, Mobile Brand : Samsung, Model : A14, Release Year : 2024

Copied Mobile & SIM Details After Changing SimCard
Sim Name : Jio, Sim Number : 9067987261, Mobile Brand : Samsung, Model : A14, Release Year : 2024
*/
