/*
Write a Java program that reads an array of integers, filters out the negative numbers, 
and then calculates the sum of the squares of the remaining positive numbers using streams and the reduce method.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example2 
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            
            System.out.println("Enter how many numbers: ");
            int num = sc.nextInt();

            System.out.println("Enter "+num+" numbers: ");
            for(int i=0; i<num; i++){
                list.add(sc.nextInt());
            }
            
            int sum = list.stream().filter(number -> number > 0).map(number -> number*number).reduce(0,Integer::sum);

            System.out.println("Sum of squares of positive numbers: "+sum);
    
    }
}

/*
Enter how many numbers: 
6
Enter 6 numbers: 
-1
2
-5
4
-10
6
Sum of squares of positive numbers: 56
*/
