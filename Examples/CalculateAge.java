import java.util.*;
import java.time.LocalDate;

public class CalculateAge
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Birthdate year: ");
        int year = sc.nextInt();

        LocalDate date = LocalDate.now();
         int totalAge = date.getYear() - year;

        System.out.println("Your age is "+totalAge+" years "+date.getMonthValue()+" months "+date.getDayOfYear()+" days");
    }
}

/*
Enter your Birthdate year: 
2003
Your age is 22 years 1 months 15 days
*/