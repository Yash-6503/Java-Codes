//ELC (main) class of Payroll System -> PayrollSystem.java
package pkg.blc;

public class PayrollSystem {

	public static void main(String[] args) 
	{
		TaxUtil tax = new TaxUtil();

		Employee emp = new Employee(101,"Virat Kohli",50000,5000,5000);
		System.out.println("Employee Gross Salary : "+emp.calculateGrossSalary());
		System.out.println("Employee Tax : "+tax.calculateTax(emp));
		System.out.println();
		
		Manager m = new Manager(121,"Rohit Sharma",40000,3000,5000,2000);
		System.out.println("Manager Gross Salary : "+m.calculateGrossSalary());
		System.out.println("Manager Tax : "+tax.calculateTax(m));
		System.out.println();

		Trainer t = new Trainer(221,"M.S.Dhoni",100000,5000,5000,10,1000);
		System.out.println("Trainer Gross Salary : "+t.calculateGrossSalary());
		System.out.println("Trainer Tax : "+tax.calculateTax(t));
		System.out.println();
		
		Sourcing source = new Sourcing(191,"Narendra Modi",75000,2000,4000,50,25,100);
		System.out.println("Sourcing Gross Salary : "+source.calculateGrossSalary());
		System.out.println("Sourcing Tax : "+tax.calculateTax(source));
		System.out.println();
		
		Employee emp1 = new Employee(201,"Salman Khan",15000,5000,3000);
		System.out.println("Employee Gross Salary : "+emp1.calculateGrossSalary());
		System.out.println("Employee Tax : "+tax.calculateTax(emp1));
				
	}
}

/*  Tested with Positive values
Employee Gross Salary : 60000.0
Employee Tax : 12000.0

Manager Gross Salary : 50000.0
Manager Tax : 10000.0

Trainer Gross Salary : 120000.0
Trainer Tax : 24000.0

Sourcing Gross Salary : 81000.0
Sourcing Tax : 16200.0

Employee Gross Salary : 23000.0
Employee Tax : 1150.0
*/

/*  Tested with Negative values
Employee Gross Salary : 60000.0
Employee Tax : 12000.0

Manager Gross Salary : 50000.0
Manager Tax : 10000.0

Trainer Gross Salary : 120000.0
Trainer Tax : 24000.0

Sourcing Gross Salary : 81000.0
Sourcing Tax : 16200.0

Error Invalid Input Basic Salary
*/
