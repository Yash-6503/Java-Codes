/*
Program to calculate square of a number using user defined functional interface
*/

import java.util.*;

@FunctionalInterface
interface Square{
    int doSquare(int num);
}

@FunctionalInterface
interface Sq{
    void square(int num);
}

public class CalculateSquare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");    //Taking input from user
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        Square sq = num -> num * num;           //Lambda expression to calculate square of a number

        Sq sq1 = (int num) -> System.out.println("Square of "+number2+" is: "+(num * num));     //Lambda expression to calculate square of a number

        System.out.println("Square of "+number1+" is: "+sq.doSquare(number1));      //Calling lambda expression to print output

        sq1.square(number2);        //Calling lambda expression to print output
    }   
}

/*
Enter 2 numbers: 
10
20
Square of 10 is: 100
Square of 20 is: 400
*/