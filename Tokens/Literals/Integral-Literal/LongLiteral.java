/*
Long Literal is a constant value that is assigned to the long data type variable.
it takes 64 bits in memory.
it accepts values from -2^63 to 2^63-1.
*/

package com.classes;

public class LongLiteral
{
    public static void main(String args[])
    {
        long a = 10;
        long b = 20;
        long c = 30;
        long d = 1L;
        long e = 2l;
        //long f = 1.2;     //error: incompatible types: possible lossy conversion from double to long

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //System.out.println(f);
    }
}

/*
10
20
30
1
2
*/