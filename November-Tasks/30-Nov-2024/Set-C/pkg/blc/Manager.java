//BLC class of EmployeeManagementSystem -> Manager.java

package pkg.blc;

public class Manager {

	Employee emp;
	
	public Manager(Employee emp)
	{
		this.emp = emp;
	}
	
	public void assignTask()
	{
		System.out.println(emp.name+" is assigning tasks.");
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+emp.name+", Employee Id : "+emp.employeeId);
	}
}
