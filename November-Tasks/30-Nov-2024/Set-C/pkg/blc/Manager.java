//BLC class of EmployeeManagementSystem -> Manager.java

package pkg.blc;

public class Manager extends Employee
{

	
	public Manager(String name, int employeeId)
	{
		super(name, employeeId);
	}
	
	
	public void assignTask()
	{
		System.out.println(name+" is assigning tasks.");
	}
	
}
