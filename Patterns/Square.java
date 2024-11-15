//Square pattern program in Java which takes input from cmd line

package com.classes;

public class Square
{
    public static void main(String args[])
    {
        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);

        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=columns; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
java Square.java 4 5
* * * * * 
* * * * *
* * * * *
* * * * *
*/