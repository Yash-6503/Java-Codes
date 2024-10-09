/*
write a Java program to calculate compound interest for 3 years? 
 Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
*/

package com.classes;

public class FindCompoundInterest
{
    public static void main(String args[])
    {
        double Principle = Double.parseDouble(args[0]);
        double Rate = Double.parseDouble(args[1]);
        // int years = Integer.parseInt(args[2]);

        double Compound_Interest = Principle*((1+Rate/100)*(1+Rate/100)*(1+Rate/100));

        System.out.printf("Compound Interest on %.2f is %.2f", Principle, Compound_Interest);
    }
}

/*
Compound Interest on 5000.00 is 6655.00

Compound Interest on 1000.00 is 1331.00
*/