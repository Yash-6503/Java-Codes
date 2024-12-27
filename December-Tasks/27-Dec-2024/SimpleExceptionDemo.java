/*
Program to Handle InputMisMatchException and give appropiate message
*/

import java.util.*;

public class SimpleExceptionDemo
{
    public static void main(String args[])
    {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a value: ");
            int a = sc.nextInt();

            System.out.println("Enter b value: ");
            int b = sc.nextInt();

        }catch(InputMismatchException e){
            System.out.println("Please provide Numbers");
            System.out.println(e);
            System.out.println("Message: "+e.getMessage());
            e.printStackTrace();

        }
    }
}

/*
Please provide Numbers
java.util.InputMismatchException
Message: null
java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        at SimpleExceptionDemo.main(SimpleExceptionDemo.java:15)
*/