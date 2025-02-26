/*
Write a Java program that creates a stream of integers using Stream.of, filters out the even numbers 
and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2
4
6
8
10
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Example1 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter how many numbers you wants to add: ");
        int num = sc.nextInt();

        System.out.println("Enter "+num+" numbers: ");
        for(int i=0; i<num; i++)
        {
            list.add(sc.nextInt());
        }

        list.stream().filter(number->number%2==0).map(number -> number * number).forEach(System.out::println);
    
	}

}

/*
Enter how many numbers you wants to add: 
10
Enter 10 numbers: 
1
2
3
4
5
6
7
8
9
10
4
16
36
64
100
*/