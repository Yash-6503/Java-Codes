//Employee Payroll System

package com.classes;

class Employee 
{
	private String name;
	private int employeeId;
	private double basicSalary;
	
	public Employee(String name, int employeeId, double basicSalary)
	{
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
	}

	public String getName()
	{
		return name;
	}
	
	public int getEmployeeId()
	{
		if(employeeId > 0) {
			return employeeId;
		}else {
			return -1;
		}
	}
	
	public double getBasicSalary()
	{
		if(basicSalary > 0) {
			return basicSalary;
		}else {
			return -1;
		}
	}
}

class FullTimeEmployee extends Employee 
{
	private double bonus;
	
	public FullTimeEmployee(String name, int employeeId, double basicSalary, double bonus)
	{
		super(name,employeeId,basicSalary);
		this.bonus = bonus;
	}
	
	public double getBonus()
	{
		if(bonus > 0) {
			return bonus;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		if(getEmployeeId() == -1 && !(getBasicSalary() == -1) && !(getBonus() == -1)){
			return "Invalid Input Employee Id";
		}else if(getBasicSalary() == -1 && !(getEmployeeId() == -1) && !(getBonus() == -1)) {
			return "Invalid Input Basic Salary";
		}else if(getBonus() == -1 && !(getEmployeeId() == -1) && !(getBasicSalary() == -1)) {
			return "Invalid Input Bonus";
		}else if(getEmployeeId() == -1 && getBasicSalary() == -1 && !(getBonus() == -1)) {
			return "Invalid Input Employee Id and Basic Salary";
		}else if(getEmployeeId() == -1 && getBonus() == -1 && !(getBasicSalary() == -1)) {
			return "Invalid Input Employee Id and Bonus";
		}else if(getBasicSalary() == -1 && getBonus() == -1 && !(getEmployeeId() == -1)) {
			return "Invalid Input Basic Salary and Bonus";
		}else if(getEmployeeId() == -1 && getBasicSalary() == -1 && getBonus() == -1) {
			return "Invalid Input Employee Id, Basic Salary and Bonus";
		}else {
			return "Full Time Employee Details\nName : " + getName() + "\nEmployee Id : "
				+ getEmployeeId() + "\nBasic Salary : " + getBasicSalary() + "\nBonus : " +getBonus();
		}
	}
}

class PartTimeEmployee extends Employee 
{
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String name, int employeeId, double basicSalary, int hoursWorked, double hourlyRate)
	{
		super(name,employeeId,basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public int getHoursWorked()
	{
		if(hoursWorked > 0) {
			return hoursWorked;
		}else {
			return -1;
		}
	}
	
	public double getHourlyRate()
	{
		if(hourlyRate > 0) {
			return hourlyRate;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		if(getEmployeeId() == -1 && !(getBasicSalary() == -1) && !(getHoursWorked() == -1) && !(getHourlyRate() == -1)){
			return "Invalid Input Employee Id";
		}else if(getBasicSalary() == -1 && !(getEmployeeId() == -1) && !(getHoursWorked() == -1) && !(getHourlyRate() == -1)) {
			return "Invalid Input Basic Salary";
		}else if(getHoursWorked() == -1 && !(getEmployeeId() == -1) && !(getBasicSalary() == -1) && !(getHourlyRate() == -1)) {
			return "Invalid Input Hours Worked";
		}else if(getHourlyRate() == -1 && !(getEmployeeId() == -1) && !(getBasicSalary() == -1) && !(getHoursWorked() == -1)) {
			return "Invalid Input Hourly Rate";
		}else if(getEmployeeId() == -1 && getBasicSalary() == -1 && !(getHoursWorked() == -1) && !(getHourlyRate() == -1)) {
			return "Invalid Input Employee Id and Basic Salary";
		}else if(getEmployeeId() == -1 && getHoursWorked() == -1 && !(getBasicSalary() == -1) && !(getHourlyRate() == -1)) {
			return "Invalid Input Employee Id and Hours Worked";
		}else if(getEmployeeId() == -1 && getHourlyRate() == -1 && !(getBasicSalary() == -1) && !(getHoursWorked() == -1)) {
			return "Invalid Input Employee Id and Hourly Rate";
		}else if(getBasicSalary() == -1 && getHoursWorked() == -1 && !(getEmployeeId() == -1) && !(getHourlyRate() == -1)) {
			return "Invalid Input Basic Salary and Hours Worked";
		}else if(getBasicSalary() == -1 && getHourlyRate() == -1 && !(getEmployeeId() == -1) && !(getHoursWorked() == -1)) {
			return "Invalid Input Basic Salary and Hourly Rate";
		}else if(getHourlyRate() == -1 && getHoursWorked() == -1 && !(getEmployeeId() == -1) && !(getBasicSalary() == -1)) {
			return "Invalid Input Hours Worked and Hourly Rate";
		}else if(getEmployeeId() == -1 && getBasicSalary() == -1 && getHoursWorked() == -1 && !(getHourlyRate() == -1)) {
			return "Invalid Input Employee Id, Basic Salary and Hours Worked";
		}else if(getBasicSalary() == -1 && getHoursWorked() == -1 && getHourlyRate() == -1 && !(getEmployeeId() == -1 )) {
			return "Invalid Input Basic Salary, Hours Worked and Hourly Rate";
		}else if(getEmployeeId() == -1 && getBasicSalary() == -1 && getHourlyRate() == -1 && !(getHoursWorked() == -1)) {
			return "Invalid Input Employee Id, Basic Salary and Hourly Rate";
		}else if(getEmployeeId() == -1 && getHoursWorked() == -1 && getHourlyRate() == -1 && !(getBasicSalary() == -1)) {
			return "Invalid Input Employee Id, Hours Worked and Hourly Rate";
		}else if(getEmployeeId() == -1 && getBasicSalary() == -1 && getHoursWorked() == -1 && getHourlyRate() == -1) {
			return "Invalid Input Employee Id, Basic Salary, Hours Worked and Hourly Rate";
		}else {
			return "Part Time Employee Details\nName : " + getName() + "\nEmployee Id : " + getEmployeeId() + "\nBasic Salary : "
					+ getBasicSalary() + "\nHours Worked : " + getHoursWorked() + "\nHourly Rate : " + getHourlyRate();
		}
	}	
}

public class EmployeePayroll 
{

	public static void main(String[] args) 
	{	
		FullTimeEmployee femp = new FullTimeEmployee("Virat Kohli",101,55000.66,5000);
		PartTimeEmployee pemp = new PartTimeEmployee("Rohit Sharma",201,50000,8,500);
		
		System.out.println(femp);
		System.out.println();
		System.out.println(pemp);
	}
}

/* Tested with Positive Values
Full Time Employee Details
Name : Virat Kohli
Employee Id : 101
Basic Salary : 55000.66
Bonus : 5000.0

Part Time Employee Details
Name : Rohit Sharma
Employee Id : 201
Basic Salary : 50000.0
Hours Worked : 8
Hourly Rate : 500.0
*/

/* Tested with Negative Values to Full Time Employee Details
Invalid Input Employee Id and Basic Salary

Part Time Employee Details
Name : Rohit Sharma
Employee Id : 201
Basic Salary : 50000.0
Hours Worked : 8
Hourly Rate : 500.0
*/

/* Tested with Negative Values to Part Time Employee Details
Full Time Employee Details
Name : Virat Kohli
Employee Id : 101
Basic Salary : 55000.66
Bonus : 5000.0

Invalid Input Employee Id, Hours Worked and Hourly Rate
*/