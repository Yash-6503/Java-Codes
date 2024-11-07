/*
Q1 )  create base class Animal 

Attributes:-

No Attributes

methods:-

return type :- void
method Name :- eat
behavior of eat method:- this method will print the message that "This animal eats food."
------
create derived class name as Dog inherit from Animal

Attribute:-

No Attributes


methods:-

return type :- void
method Name :- bark
behavior of bark method:- this method will print the Message "The dog barks."

------
create main class to test your logic 
create object initialize the values and call the methods
*/

package com.classes;

class Animal
{
    void eat()
    {
        System.out.println("This Animals is eats Food");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("The Dog Barks.");
    }
}

public class Example1 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

/*
This Animals is eats Food
The Dog Barks.
*/