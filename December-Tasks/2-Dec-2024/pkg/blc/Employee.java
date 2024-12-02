//BLC class of Payroll System -> Employee.java

package pkg.blc;

public class Employee 
{	
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	public Employee(int id, String name, double basicSalary, double HRAPer, double DAPer) {
		if(basicSalary > 0 && HRAPer > 0 && DAPer > 0) {
			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			this.HRAPer = HRAPer;
			this.DAPer = DAPer;
		}else if(basicSalary > 0 && HRAPer > 0 && DAPer <= 0) {
			System.out.println("Error Invalid Input DAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input HRAPer");
			System.exit(0);
			return;
		}else if(HRAPer > 0 && DAPer > 0 && basicSalary <= 0) {
			System.out.println("Error Invalid Input Basic Salary");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0){
			System.out.println("Error Invalid Input HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary and HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and DAPer");
			System.exit(0);
			return;
		}else {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer");
			System.exit(0);
			return;
		}

	}
	
	public double calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer;
	}
	
}
