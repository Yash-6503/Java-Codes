/*
Program 02 :
------------
Create a BLC class Employee class with properties 

private String firstName
private String lastName
private int employeeId
private double salary
private int noOfProject


Create a setEmployeeData() method with 5 parameters to initialize all the instance variables.

Implement calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.

NoOfProject is more than 5 and less that 10 then add 5000.
NoOfProject is more than 10 and less that 20 then add 10000.
NoOfProject is more than 20 then add 15000. 	

 Take a method called displayDetails() to display the salary.

 Take an ELC class Tester to test your logic.
*/

package com.classes;

public class EmployeeData
{
    public static void main(String args[])
    {
        Employee emp = new Employee();

        emp.setEmployeeData("Yash","Walke",101,20000,21);

        System.out.println(emp.displayDetails());

    }
}

/*
Employee [firstName=Yash, lastName=Walke, employeeId=101, salary=35000.0]
*/
