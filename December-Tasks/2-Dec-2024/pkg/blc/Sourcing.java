//BLC class of Payroll System -> Sourcing.java

package pkg.blc;

public class Sourcing 
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	public Sourcing(int id, String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		if(basicSalary > 0 && HRAPer > 0 && DAPer > 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			this.HRAPer = HRAPer;
			this.DAPer = DAPer;
			this.enrollmentTarget = enrollmentTarget;
			this.enrollmentReached = enrollmentReached;
			this.perkPerEnrollment = perkPerEnrollment;
		}else if(basicSalary > 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && DAPer <= 0) {
			System.out.println("Error Invalid Input DAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(HRAPer > 0 && DAPer > 0 && basicSalary <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && DAPer <= 0 && HRAPer <= 0){
			System.out.println("Error Invalid Input HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary and HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input DAPer and Enrollment Tatget");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input DAPer and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input DAPer and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer and Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer and Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && HRAPer <= 0 && DAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer and Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input DAPer, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input DAPer, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input DAPer, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer and Enrollment Target");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input DAPer, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer, Enrollment Target and Enrollment Reached");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached > 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer, Enrollment Target and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget > 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer > 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && enrollmentTarget <= 0 && enrollmentReached <= 0 && perkPerEnrollment <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}
		else {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer, Enrollment Target, Enrollment Reached and Perk Per Enrollment");
			System.exit(0);
			return;
		}
	}
	
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
	}
}
