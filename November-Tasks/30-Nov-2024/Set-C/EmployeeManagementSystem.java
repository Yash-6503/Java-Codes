//ELC class of Employee, Manager, Developer, Intern -> EmployeeManagementSystem.java

package pkg.blc;

public class EmployeeManagementSystem {

	public static void main(String[] args) 
	{

		Employee e1 = new Employee("Alice",101);
		Employee e2 = new Employee("Bob",102);
		Employee e3 = new Employee("Charlie",103);
		
		System.out.println("Manager Details");
		Manager m = new Manager(e1);
		m.displayDetails();
		m.assignTask();
		
		System.out.println("\nDeveloper Details");
		Developer d = new Developer(e2);
		d.displayDetails();
		d.writeCode();
		
		System.out.println("\nIntern Details");
		Intern i = new Intern(e3);
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
