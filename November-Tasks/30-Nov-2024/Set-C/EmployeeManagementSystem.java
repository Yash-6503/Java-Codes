//ELC class of Employee, Manager, Developer, Intern -> EmployeeManagementSystem.java

package pkg.blc;

public class EmployeeManagementSystem {

	public static void main(String[] args) 
	{
		System.out.println("Manager Details");
		Manager m = new Manager("Alice",101);
		m.displayDetails();
		m.assignTask();
		
		System.out.println("\nDeveloper Details");
		Developer d = new Developer("Bob",102);
		d.displayDetails();
		d.writeCode();
		
		System.out.println("\nIntern Details");
		Intern i = new Intern("Charlie",103);
		i.displayDetails();
		i.learn();
	}

}

/*
Manager Details
Name : Alice, Employee Id : 101
Alice is assigning tasks.

Developer Details
Name : Bob, Employee Id : 102
Bob is writing code.

Intern Details
Name : Charlie, Employee Id : 103
Charlie is learning.
 */
