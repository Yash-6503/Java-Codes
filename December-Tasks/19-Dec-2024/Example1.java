/*
Program that demonstrates the usage of the Predicate interface to test if a 
number is even or prime.
*/

import java.util.function.Predicate;
import java.util.*;

public class Example1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        Predicate<Integer> p1 = (Integer a) -> a%2==0;
        System.out.println("Is "+num+" even? "+p1.test(num));
        
        Predicate<Integer> p2 = (Integer b) -> b%2==1;
        System.out.println("Is "+num+" even? "+p2.test(num));
    }
}

/*
Enter a Number: 
13
Is 13 even? false
Is 13 even? true
*/

/*
Enter a Number: 
5
Is 5 even? false
Is 5 even? true
*/

/*
Enter a Number: 
20
Is 20 even? true
Is 20 even? false
*/