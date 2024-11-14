package com.classes;

// Write a Program on OOPs to define Dog class properties and behaviour.

class Dog
{
    String name;
    double height;
    int age;

    public Dog(String name, double height, int age)
    {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public void getDogInformation()
    {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
    }    

    public void bark()
    {
        System.out.println("Dog is barking");
    }
}

public class Example1{
    public static void main(String args[])
    {
        Dog d = new Dog("Tommy", 2.5, 5);   
        System.out.println("Dog Information");
        d.getDogInformation();
        d.bark();
    }
}

/*
Dog Information
Name: Tommy
Height: 2.5
Age: 5
Dog is barking
*/