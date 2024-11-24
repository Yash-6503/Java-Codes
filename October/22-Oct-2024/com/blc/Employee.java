package com.blc;

public class Employee
{
    int employeeId;
    String employeeName;
    double employeeSalary;

    public void setEmployeeData(int employeeId, String employeeName, double employeeSalary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public void getEmployeeData()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}