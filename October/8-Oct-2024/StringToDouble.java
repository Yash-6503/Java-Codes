/*
Write a java program to covert string to double using parseDouble() 
and multiply two Floating point Numbers and display the result 
by taking input from the command line argument?
*/

package com.classes;

public class StringToDouble
{
    public static void main(String args[])
    {
        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);

        double result = d1 * d2;
       
        System.out.println("Result of "+d1+" and "+d2+" is " + result);
    }
}

/*
Result of 2.5 and 3.5 is 8.75
*/