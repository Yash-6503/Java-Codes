//BLC class of EmployeeManagementSystem -> Employee.java

package pkg.blc;

public class Employee {

	String name;
	int employeeId;
	
	public Employee(String name, int employeeId)
	{
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+name+", Employee ID: "+employeeId);
	}
}
