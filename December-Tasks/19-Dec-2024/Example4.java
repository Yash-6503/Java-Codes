/*
Program that utilizes the Function interface within the main method to 
perform operations on both strings and integers.
*/

import java.util.function.*;
import java.util.*;

public class Example4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        Function<String,Integer> f1 = (String s) -> s.length();
        System.out.println("String Length of "+str+" is "+f1.apply(str));

        Function<Integer,Double> f2 = (Integer a) -> a/2.0;
        System.out.println("Result of dividing of "+num+" by 2 is "+f2.apply(num));
    }
}

/*
Enter a String: 
Hello
Enter a Number: 
10
String Length of Hello is 5
Result of dividing of 10 by 2 is 5.0
*/

/*
Enter a String: 
Java Programming
Enter a Number: 
15
String Length of Java Programming is 16
Result of dividing of 15 by 2 is 7.5
*/

/*
Enter a String: 

Enter a Number: 
8
String Length of  is 0
Result of dividing of 8 by 2 is 4.0
*/