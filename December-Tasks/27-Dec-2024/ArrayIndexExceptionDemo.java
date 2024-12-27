/*
Program to Handle ArrayIndexOutOfBoundsException using appropriate message.
*/

import java.util.*;

public class ArrayIndexExceptionDemo
{
    public static void main(String args[])
    {
        try{
            Scanner sc  = new Scanner(System.in);

            int a[] = new int[2];

            System.out.println(a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            // System.out.println("Array Index Out of Bounds Exception.");
            // System.out.println(e);
            // System.out.println("Message: "+e.getMessage());
            e.printStackTrace();

        }
    }
}

/*
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        at ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)
*/