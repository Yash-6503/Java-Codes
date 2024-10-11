/*
Integer Literal is a constant value that is assigned to the integer data type variable.
it takes 32 bits in memory.
*/

package com.classes;

public class IntegerLiteral
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        int c = 30;
        //int d = 1.2;     //error: incompatible types: possible lossy conversion from double to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
}

/*
10
20
30
*/