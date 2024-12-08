//Program to create a defense system with different types of airstrikes.

package com.SetA2;

class Airstrike 
{
	String name;
	String missionDetails;
	
	public Airstrike(String name, String missionDetails)
	{
		this.name = name;
		this.missionDetails = missionDetails;
	}
	
	public Airstrike getAirstrikePlan()
	{
		System.out.println("Generating a generic airstrike plan...");
		return new Airstrike(name,missionDetails);
	}
}

class PrecisionAirstrike extends Airstrike 
{
	public PrecisionAirstrike(String name, String missionDetails) {
		super(name, missionDetails);
	}

	@Override
	public PrecisionAirstrike getAirstrikePlan()
	{
		System.out.println("Generating a precision airstrike plan...");
		return new PrecisionAirstrike(name,missionDetails);
	}
}

class CarpetBombingAirstrike extends Airstrike
{

	public CarpetBombingAirstrike(String name, String missionDetails) {
		super(name, missionDetails);
	}

	@Override
	public CarpetBombingAirstrike getAirstrikePlan()
	{
		System.out.println("Generating a CarpetBombing airstrike plan...");
		return new CarpetBombingAirstrike(name,missionDetails);
	}
}

public class DefenseSystem {

	public static void main(String[] args) {

		Airstrike air = new Airstrike("Air Strike","Mission to win");
		air.getAirstrikePlan();
		
		System.out.println();
		PrecisionAirstrike p = new PrecisionAirstrike("Precision Airstrike","Targeting coordinates locked. Minimum collateral damage ensured.");
		p.getAirstrikePlan();
		System.out.println(p.missionDetails);
		
		System.out.println();
		CarpetBombingAirstrike c = new CarpetBombingAirstrike("Carpet Bombing Airstrike","All coordinates in a 5km radius will be bombed for maximum impact.");
		c.getAirstrikePlan();
		System.out.println(c.missionDetails);
	}
}

/*
Generating a generic airstrike plan...

Generating a precision airstrike plan...
Targeting coordinates locked. Minimum collateral damage ensured.

Generating a CarpetBombing airstrike plan...
All coordinates in a 5km radius will be bombed for maximum impact.
*/