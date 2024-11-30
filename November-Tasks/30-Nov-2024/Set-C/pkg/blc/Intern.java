//BLC class of EmployeeManagementSystem -> Intern.java

package pkg.blc;

public class Intern extends Employee
{	
	public Intern(String name, int employeeId)
	{
		super(name, employeeId);
	}
	
	public void learn()
	{
		System.out.println(name+" is learning.");
	}
	
}

