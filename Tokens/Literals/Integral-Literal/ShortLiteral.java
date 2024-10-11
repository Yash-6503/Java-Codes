/*
Short Literal is a constant value that is assigned to the short data type variable.
it takes 16 bits in memory.
it accepts values from -2^15 to 2^15-1.
*/

package com.classes;

public class ShortLiteral
{
    public static void main(String args[])
    {
        short a = 10;
        short b = 32767;
        //short c = 32768;   //error: incompatible types: possible lossy conversion from int to short
        //short d = 1.2;     //error: incompatible types: possible lossy conversion from double to short

        System.out.println(a);
        System.out.println(b);
        //System.out.println(c);
    }
}

/*
10
32767
*/