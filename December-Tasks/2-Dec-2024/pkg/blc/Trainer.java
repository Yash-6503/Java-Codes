//BLC class of Payroll System -> Trainer.java

package pkg.blc;

public class Trainer {

	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount, double perkPerBatch) {
		if(basicSalary > 0 && HRAPer > 0 && DAPer > 0 && batchCount > 0 && perkPerBatch > 0) {
			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			this.HRAPer = HRAPer;
			this.DAPer = DAPer;
			this.batchCount = batchCount;
			this.perkPerBatch = perkPerBatch;
		}else if(basicSalary > 0 && HRAPer > 0 && batchCount > 0 && perkPerBatch > 0 && DAPer <= 0) {
			System.out.println("Error Invalid Input DAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && batchCount > 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && batchCount > 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && batchCount <= 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input Batch Count");
			System.exit(0);
			return;
		}else if(HRAPer > 0 && DAPer > 0 && basicSalary <= 0 && batchCount > 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input Basic Salary");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && batchCount > 0 && perkPerBatch > 0 && DAPer <= 0 && HRAPer <= 0){
			System.out.println("Error Invalid Input HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && batchCount > 0 && perkPerBatch > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary and HRAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && batchCount > 0 && perkPerBatch > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && batchCount <= 0 && perkPerBatch > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && batchCount > 0 && perkPerBatch <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && batchCount <= 0 && perkPerBatch > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input DAPer and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && batchCount > 0 && perkPerBatch <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input DAPer and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && batchCount <= 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input HRAPer and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && batchCount > 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input HRAPer and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer > 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && batchCount > 0 && perkPerBatch > 0 && HRAPer <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and DAPer");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && batchCount <= 0 && perkPerBatch > 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && batchCount > 0 && perkPerBatch <= 0 && HRAPer > 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && HRAPer <= 0 && batchCount <= 0 && DAPer > 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && batchCount > 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && batchCount <= 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && batchCount > 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer > 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input DAPer, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer > 0 && HRAPer <= 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input HRAPer, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer > 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Basic Salary, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}
		else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && batchCount <= 0 && perkPerBatch > 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer and Batch Count");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer <= 0 && batchCount > 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer <= 0 && HRAPer > 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Basic Salary, DAPer, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary <= 0 && DAPer > 0 && HRAPer <= 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}else if(basicSalary > 0 && DAPer <= 0 && HRAPer <= 0 && batchCount <= 0 && perkPerBatch <= 0) {
			System.out.println("Error Invalid Input HRAPer, DAPer, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}
		else {
			System.out.println("Error Invalid Input Basic Salary, HRAPer, DAPer, Batch Count and Perk Per Batch");
			System.exit(0);
			return;
		}
	}
	
	public double calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer +(batchCount * perkPerBatch);
	}
}
