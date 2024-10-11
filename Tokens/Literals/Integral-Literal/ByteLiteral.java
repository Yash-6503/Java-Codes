/*
Byte Literal is a constant value that is assigned to the byte data type variable.
it takes 8 bits in memory.
it accepts values from -128 to 127.
*/

package com.classes;

public class ByteLiteral
{
    public static void main(String args[])
    {
        byte a = 10;
        byte b = 127;
        //byte c = 128;   //error: incompatible types: possible lossy conversion from int to byte

        System.out.println(a);
        System.out.println(b);
        //System.out.println(c);
    }
}

/*
10
127
*/

