/*
Static Methods in Java
*/

package com.classes;

public class staticMethod
{
    public static void main(String args[])
    {
        //To call the staic method of same class then no need to create object
        m1();
        //To call the static method of another class then use the classname of it
        Demo.m2();
    }

    //Static method m1 defination
    public static void m1()
    {
        System.out.println("Method1");
    }
}

//Another class Demo
class Demo
{
    //static method of another class m2 defination
    public static void m2()
    {
        System.out.println("Method2");
    }
}


/*output
Method1
Method2
*/
