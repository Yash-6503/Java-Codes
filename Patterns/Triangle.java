//Triangle pattern program in Java which takes input from cmd line

package com.classes;

public class Triangle
{
    public static void main(String args[])
    {
        int rows = Integer.parseInt(args[0]);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
java Triangle.java 5
* 
* * 
* * * 
* * * * 
* * * * * 
*/