/*
5) Write a program to calculate the tax for a taxable income of Rs.    9,90,000, if the tax rate is fixed at 4.9%.
*/

public class FindTax
{
    public static void main(String args[])
    {
        //for direct initialization
        // long amt = 990000;
        // double tax = 4.9;
        double payingTax;

        //using command line argument
        long amt = Long.parseLong(args[0]);
        double tax = Double.parseDouble(args[1]);

        payingTax = (amt/100)*tax;

        System.out.println("Tax for a taxable income of Rs. "+amt+" is Rs. "+payingTax);
    }
}

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\4-Oct-2024> java  FindTax.java   
Tax for a taxable income of Rs. 990000 is Rs. 48510.0
*/