//BLC class of Payroll System -> TaxUtil.java

package pkg.blc;

public class TaxUtil 
{	
	public double calculateTax(Employee employee)
	{	
		if(employee.calculateGrossSalary() > 30000) {
			return (employee.calculateGrossSalary() / 100) * 20;
		}else {			
			return (employee.calculateGrossSalary() / 100) * 5;
		}
	}
	
	public double calculateTax(Manager manager)
	{
		if(manager.calculateGrossSalary() > 30000) {
			return (manager.calculateGrossSalary() / 100) * 20;
		}else {			
			return (manager.calculateGrossSalary() / 100) * 5;
		}
	}
	
	public double calculateTax(Trainer trainer)
	{
		if(trainer.calculateGrossSalary() > 30000) {
			return (trainer.calculateGrossSalary() / 100) * 20;
		}else {			
			return (trainer.calculateGrossSalary() / 100) * 5;
		}
	}
	
	public double calculateTax(Sourcing sourcing)
	{
		if(sourcing.calculateGrossSalary() > 30000) {
			return (sourcing.calculateGrossSalary() / 100) * 20;
		}else {			
			return (sourcing.calculateGrossSalary() / 100) * 5;
		}
	}
}
