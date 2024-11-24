package com.blc;

import java.util.Scanner;

public class Example2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee Id: ");
        int employeeId = sc.nextInt();
        System.out.println("Enter the Employee Name: ");
        sc.next();
        String employeeName = sc.nextLine();
        System.out.println("Enter the Employee Salary: ");
        double employeeSalary = sc.nextDouble();

        Employee emp = new Employee();
        emp.setEmployeeData(employeeId, employeeName, employeeSalary);
        emp.getEmployeeData();

    }   
}


/*
Enter the Employee Id: 
101
Enter the Employee Name: 
Virat Kohli
Enter the Employee Salary: 
5000000
Employee ID: 101
Employee Name:  Kohli
Employee Salary: 5000000.0
*/