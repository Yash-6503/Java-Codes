/*
Implement a method using streams to convert a list of objects (e.g., Employee) into 
another list containing only one property of the object (e.g., Employee.name).
*/

// package classes;

import java.util.*;
import java.util.stream.*;

record Employee(Integer id, String name){}

// class Employee
// {
//     Integer id;
//     String name;

//     public Employee(Integer id, String name)
//     {
//         this.id = id;
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }

// }

public class Example5
{
    public static void main(String args[])
    {
        List<Employee> listOfEmployee = Arrays.asList(
            new Employee(111,"Smith"),
            new Employee(222,"Scott"),
            new Employee(333,"Alen")
        );

        List<String> empNames = listOfEmployee.stream().map(str -> str.name()).collect(Collectors.toList());

        empNames.forEach(System.out::println);
    }
}

/*
Smith
Scott
Alen
*/