/*
Create a record of Employee with attributes name:(String) and id:(String)
Given a list of Employee objects with name and salary properties, write a program to filter the list 
of Employees by salary in who are having salary > 30000 and print the employee names.
*/

// package classes;

import java.util.*;
import java.util.stream.*;

record Employee(Integer id, String name, Double salary){}

public class Example6
{
    public static void main(String args[])
    {
        List<Employee> empList = Arrays.asList(
            new Employee(111,"Smith",20000.22),
            new Employee(222,"Scott",70000.43),
            new Employee(333,"Alen",50000.33)
        );

        empList.stream().filter(emp -> emp.salary() > 30000).map(e -> e.name()).forEach(System.out::println);
    }
}

/*
Scott
Alen
*/