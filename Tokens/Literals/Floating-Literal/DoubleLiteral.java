/*
By default every floating point literal is of type double only
*/

package com.classes;

public class DoubleLiteral
{
    public static void main(String args[])
    {
        double a = 12.3;
        double b = 90.7d;
        double c = 56.6D;
        //double d = 1.2f;     //error: incompatible types: possible lossy conversion from float to double

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
}

/*
12.3
90.7
56.6
*/