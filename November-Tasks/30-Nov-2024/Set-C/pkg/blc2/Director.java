//BLC class of EmployeeManagementSystem -> Director.java

package pkg.blc2;

public class Director {

	String name;
	int birthYear;
	
	public Director(String name, int birthYear)
	{
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Birth year : "+birthYear);
	}
	
}
