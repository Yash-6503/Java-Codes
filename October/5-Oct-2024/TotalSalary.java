/*
Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument
*/

public class TotalSalary
{
    public static void main(String args[])
    {
        int basciSal = Integer.parseInt(args[0]);

        int HRA = (basciSal/100)*15;
        int Conveyance_allowance = (basciSal/100)*15;
        int Entertainment_allowance = (basciSal/100)*10;
        
        float Total_Sal = basciSal + HRA + Conveyance_allowance + Entertainment_allowance;

        System.out.println("Total Salary of a person is "+Total_Sal);
    }
}

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\5-Oct-2024> java TotalSalary 20000

Total Salary of a person is 28000.0
*/
