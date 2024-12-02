//BLC class of Payroll System -> Manager.java

package pkg.blc;

public class Manager 
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	public Manager(int id, String name, double basicSalary, double HRAPer, double DAPer, double projectAllowance) {
		if(basicSalary > 0 && HRAPer > 0 && DAPer > 0 && projectAllowance > 0) {
			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			this.HRAPer = HRAPer;
			this.DAPer = DAPer;
			this.projectAllowance = projectAllowance;
		}else if(basicSalary > 0 && HRAPer > 0 && projectAllowance > 0 && DAPer <= 0) {
			System.out.println("Error Invalid Input DAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && projectAllowance > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && projectAllowance <= 0) {
			System.out.println("Error Invalid Input Project Allowance");
			System.exit(0);
			return;
		}else if(HRAPer > 0 && DAPer > 0 && projectAllowance > 0 && basicSalary <= 0) {
			System.out.println("Error Invalid Input Basic Salary");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && projectAllowance > 0 && DAPer <= 0 && HRAPer <= 0){
			System.out.println("Error Invalid Input HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && projectAllowance > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary and HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && projectAllowance > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && projectAllowance <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and Project Allowance");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && projectAllowance <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input DAPer and Project Allowance");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && projectAllowance <= 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input HRAPer and Project Allowance");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && projectAllowance > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && projectAllowance <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer and Project Allowance");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && projectAllowance <= 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and Project Allowance");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && projectAllowance <= 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer and Project Allowance");
			System.exit(0);
			return;
		}
		else {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer, Project Allowance");
			System.exit(0);
			return;
		}
	}
	
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer + projectAllowance;
	}

}
