//BLC class of EmployeeManagementSystem -> Intern.java

package pkg.blc;

public class Intern
{
	Employee emp;
	
	public Intern(Employee emp)
	{
		this.emp = emp;
	}
	
	public void learn()
	{
		System.out.println(emp.name+" is learning.");
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+emp.name+", Employee Id : "+emp.employeeId);
	}
}

