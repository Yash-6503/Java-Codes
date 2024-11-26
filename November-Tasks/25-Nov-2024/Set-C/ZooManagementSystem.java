//Zoo Management System

package com.classes;

class Animal
{
    private String name;
    private int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void makeSound()
    {
        System.out.println("The animal makes a generic sound.");
    }

    public void displayInfo()
    {
        System.out.println("Name : "+name);
        System.out.println(age <= 0 ? "Invalid Input Age" : "Age : "+age);
    }
}

class Lion extends Animal
{
    private int maneLength;

    public Lion(String name, int age, int maneLength)
    {
        super(name,age);
        this.maneLength = maneLength;
    }

    public void makeSound()
    {
        System.out.println("The lion roars loudly.");
    }

    public void displayManeLength()
    {
        System.out.println(maneLength <= 0 ? "Invalid Input Mane Length" : "Mane Length : "+maneLength);
    }
}

class Elephant extends Animal
{
    private double tuskLength;

    public Elephant(String name, int age, double tuskLength)
    {
        super(name,age);
        this.tuskLength = tuskLength;
    }

    public void makeSound()
    {
        System.out.println("The elephant trumpets.");
    }    

    public void displayTuskLenght()
    {
        System.out.println(tuskLength <= 0 ? "Invalid Input Tusk Length" : "Tusk Length : "+tuskLength);
    }
}

public class ZooManagementSystem
{
    public static void main(String args[])
    {
        Lion lion = new Lion("Lion",10,8);

        Elephant ele = new Elephant("Elephant",30,40.2);

        lion.displayInfo();
        lion.makeSound();
        lion.displayManeLength();

        System.out.println();

        ele.displayInfo();
        ele.makeSound();
        ele.displayTuskLenght();
    }
}


/* Tested with Positive Values 
Name : Lion
Age : 10
The lion roars loudly.
Mane Length : 8

Name : Elephant
Age : 30
The elephant trumpets.
Tusk Length : 40.2
*/

/*  Tested with Negative Values
Name : Lion
Invalid Input Age
The lion roars loudly.
Mane Length : 8

Name : Elephant
Age : 30
The elephant trumpets.
Invalid Input Tusk Length
*/