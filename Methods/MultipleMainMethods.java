/*
Multiple main methods inside main method
*/

package com.classes;

public class MultipleMainMethods 
{
    public static void main(String args[])
    {
        System.out.println("Hello");
        main(10);
        main('A');
        main(2.0);
    }

    //Duplicate main methods with different parameters are allowed
    public static void main(int x)
    {
        System.out.println("Good Morning");
    }

    public static void main(char c)
    {
        System.out.println("Good Afternoon");
    }

    public static void main(double d)
    {
        System.out.println("Good Evening");
    }
}

/*
Note:
In Java we can create Multiple main methods by passing different paremeters 
to it but we can't create a exact duplicate of main method because it gives 
error to us.
In such case JVM will not be able to execute our main method because 
our java program execution starts from main method.
*/