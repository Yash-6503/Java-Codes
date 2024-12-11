//Program to implement Employee Management System using Interface in Java

package com.classes;

interface Employee
{
    public double calculateSalary();
    public void generatePayroll();
}

class FullTimeEmployee implements Employee
{
    private int employeeId;
    private String employeeName;
    private double monthSalary;
    private double benefits;

    public FullTimeEmployee(int employeeId, String employeeName, double monthSalary, double benefits)
    {
        super();
        if(employeeId > 0){
            this.employeeId = employeeId;
        }else{
            System.out.println("Invalid Employee ID. Please enter a valid Employee ID.");
            System.exit(0);
        }
        if(employeeName.equals("")){
        	System.out.println("Error: Employee name cannot be empty.");
        	System.exit(0);
        }else{
        	this.employeeName = employeeName;
        }
        if(monthSalary > 0){
            this.monthSalary = monthSalary;
        }else{
            System.out.println("Error: Monthly salary cannot be negative.");
            System.exit(0);
        }

        if(benefits > 0){
            this.benefits = benefits;
        }else{
            System.out.println("Error: Benefits cannot be negative.");
            System.exit(0);
        }
    }

    @Override
    public double calculateSalary()
    {
        return monthSalary + benefits;
    }

    @Override 
    public void generatePayroll()
    {
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Monthly Salary: "+monthSalary);
        System.out.println("Extra Benefits: "+benefits);
        System.out.println("Employee Total Salary: "+calculateSalary());
    
    }
}

public class EmployeeManagementSystem
{
    public static void main(String args[])
    {
    	FullTimeEmployee femp = new FullTimeEmployee(101,"Pravin Patil",20000,5000);
        femp.calculateSalary();
        femp.generatePayroll();
    }
}

//Tested with Negative Value
/*
Error: Employee name cannot be empty.
*/

/*
Error: Monthly salary cannot be negative.
*/

/*
Error: Benefits cannot be negative.
*/

//Tested with Positive Value
/*
Employee ID: 101
Employee Name: Pravin Patil
Monthly Salary: 20000.0
Extra Benefits: 5000.0
Employee Total Salary: 25000.0
*/