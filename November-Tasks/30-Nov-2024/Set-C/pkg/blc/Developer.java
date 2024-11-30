//BLC class of EmployeeManagementSystem -> Developer.java

package pkg.blc;

public class Developer extends Employee
{
	
	public Developer(String name, int employeeId)
	{
		super(name, employeeId);
	}
	
	public void writeCode()
	{
		System.out.println(name+" is writing code.");
	}
	
}
