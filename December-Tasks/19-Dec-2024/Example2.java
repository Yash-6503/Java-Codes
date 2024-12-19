/*
Program that demonstrates the usage of the Consumer interface to perform various 
operations on a given integer and string value.
*/

import java.util.*;
import java.util.function.*;

public class Example2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        Consumer<String> c1 = (String str) -> System.out.println("After converting string to uppercase: "+str.toUpperCase());
        c1.accept(s);

        Consumer<Integer> c2 = (Integer a) -> System.out.println("After squaring the integer: "+a*a);
        c2.accept(num);
    }
}


/*
Enter a String: 
world
Enter a Number: 
5
After converting string to uppercase: WORLD
After squaring the integer: 25
*/

/*
Enter a String: 
java
Enter a Number: 
7
After converting string to uppercase: JAVA
After squaring the integer: 49
*/

/*
Enter a String: 
example
Enter a Number: 
4
After converting string to uppercase: EXAMPLE
After squaring the integer: 16
*/