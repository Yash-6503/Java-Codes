/*
Write a program to enter Principal, Rate and Time. 
Calculate and display Simple Interest and Amount.
*/

package com.classes;

public class SimpleInterest
{
    public static void main(String args[])
    {
        float Principal = Float.parseFloat(args[0]);
        float Rate = Float.parseFloat(args[1]);
        int Time = Integer.parseInt(args[2]);

        float SimpleInterest = ((Principal / 100) * Rate) * Time;

        System.out.println("Simple interest "+SimpleInterest);
    }
}

/*
Simple interest 1000
*/