/*If any numeric literal contains decimal or fraction then it is called floating point literal.
Example : 12.3, 90.7, 56.6
*/

package com.classes;

public class FloatLiteral
{
    public static void main(String args[])
    {
        float a = 12.3f;
        float b = 90.7f;
        float c = 56.6f;
        //float d = 1.2;     //error: incompatible types: possible lossy conversion from double to float

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