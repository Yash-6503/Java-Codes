package com.classes;

class Person
{
    protected String name;
    protected int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayInfo()
    {
        System.out.println("\nName = "+name);
        System.out.println("Age = "+age);
    }
}

class Employee extends Person
{
    protected String employeeId;

    public Employee(String name, int age, String employeeId)
    {
        super(name,age);
        this.employeeId = employeeId;
    }

    public void displayEmployeeInfo()
    {
        displayInfo();
        System.out.println("Employee Id = "+employeeId);
    }
}

class Manager extends Employee
{
    protected String department;

    public Manager(String name, int age, String employeeId, String department)
    {
        super(name,age,employeeId);
        this.department = department;
    }

    public void displayManagerInfo()
    {
        displayEmployeeInfo();
        System.out.println("Department = "+department);
    }
}

public class MultilevelInheritanceExample{
    public static void main(String args[])
    {
        Manager m = new Manager("Alice",35,"E123","IT");

        m.displayManagerInfo();
    }
}


/*
Name = Alice
Age = 35
Employee Id = E123
Department = IT
*/