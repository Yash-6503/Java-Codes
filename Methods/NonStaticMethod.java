/*
Non-Static Methods in Java
*/

package com.classes;

public class NonStaticMethod
{
    public static void main(String args[])
    {
        //To call the non-staic method of same class then we need to create object
        NonStaticMethod nsm = new NonStaticMethod();
        nsm.m1();
        //To call the static method of another class then we need to create object
        Demo d = new Demo();
        d.m2();
    }

    //Non-Static method m1 defination
    public void m1()
    {
        System.out.println("Method1");
    }
}

//Another class Demo
class Demo
{
    //Non-static method of another class m2 defination
    public void m2()
    {
        System.out.println("Method2");
    }
}


/*output
Method1
Method2
*/
