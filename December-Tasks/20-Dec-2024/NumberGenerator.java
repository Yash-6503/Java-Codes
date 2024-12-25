/*
Write a program that demonstrates the usage of the Supplier interface to generate 
random numbers within a specified range.
*/

import java.util.function.*;
import java.util.*;

public class NumberGenerator
{
    public static int generateRandomNumber(int max, int min){
        //direct generated a random number using math.random
        Supplier<Integer> randomNum = () -> (int)(Math.random() * (max - min + 1)) + min;

        //Using Random class
        // Supplier<Integer> randomNum = () -> {
        //     Random rand = new Random();
        //     return rand.nextInt((max - min) + 1) + min;
        // };
        return randomNum.get();
    }

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the minimum value: ");
        int min =  sc.nextInt();

        System.out.println("Enter the maximum value: ");
        int max =  sc.nextInt();

        System.out.println("Random number generated: "+generateRandomNumber(max, min));
    }
}

/*
Enter the minimum value: 
5
Enter the maximum value: 
10
Random number generated: 7
*/

/*
Enter the minimum value: 
1
Enter the maximum value: 
100
Random number generated: 15
*/

/*
Enter the minimum value: 
10
Enter the maximum value: 
20
Random number generated: 13
*/