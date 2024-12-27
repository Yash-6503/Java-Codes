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
        System.out.println("Is "+num+" prime? "+p2.test(num));

        /* Optional code to find prime number
         //To find number is prime or not
        Predicate<Integer> prime = b -> {
            int count = 0;
            if(b == 1){
                return true;
            }
            for(int i=1; i<=b; i++){
                if(b % i == 0){
                    count++;
                }
            }
            if(count == 2){
                return true;
            }else{
                return false;
            }
        };
        */
    }
}

/*
Enter a Number: 
13
Is 13 even? false
Is 13 prime? true
*/

/*
Enter a Number: 
5
Is 5 even? false
Is 5 prime? true
*/

/*
Enter a Number: 
20
Is 20 even? true
Is 20 prime? false
*/