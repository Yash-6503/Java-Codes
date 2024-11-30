//BLC class of EmployeeManagementSystem -> Developer.java

package pkg.blc;

public class Developer {

	Employee emp;
	
	public Developer(Employee emp)
	{
		this.emp = emp;
	}
	
	public void writeCode()
	{
		System.out.println(emp.name+" is writing code.");
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+emp.name+", Employee Id : "+emp.employeeId);
	}
}
