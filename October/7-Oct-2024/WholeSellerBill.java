/*
A whole-seller gives incentives in the form of discounts on the net bill. 
Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	    <5000					        5
	    >=5000 and <10000			    10
	    >=10000					        15

Display Discount %, Discount Amount and Amount Payables
*/

package com.classes;

public class WholeSellerBill
{
    public static void main(String args[])
    {
        int Bill_amt = Integer.parseInt(args[0]);

        float discount, discount_amt, Amount_payable;

        if(Bill_amt < 5000)
        {
            discount = 5;
            discount_amt = (Bill_amt/100)*discount;
            Amount_payable = Bill_amt - discount_amt;
            System.out.println("Discount of "+discount+"% on "+Bill_amt+" is "+discount_amt);
            System.out.println("Amount to Pay is "+Amount_payable);
        }   
        else if(Bill_amt >= 5000 && Bill_amt < 10000)
        {
            discount = 10;
            discount_amt = (Bill_amt/100)*discount;
            Amount_payable = Bill_amt - discount_amt;
            System.out.println("Discount of "+discount+"% on "+Bill_amt+" is "+discount_amt);
            System.out.println("Amount to Pay is "+Amount_payable);   
        }
        else if(Bill_amt >= 10000)
        {
            discount = 15;
            discount_amt = (Bill_amt/100)*discount;
            Amount_payable = Bill_amt - discount_amt;
            System.out.println("Discount of "+discount+"% on "+Bill_amt+" is "+discount_amt);
            System.out.println("Amount to Pay is "+Amount_payable);
        }
    }
}

/*
Discount of 5.0% on 4000 is 200.0
Amount to Pay is 3800.0

Discount of 10.0% on 5000 is 500.0
Amount to Pay is 4500.0

Discount of 15.0% on 10000 is 1500.0
Amount to Pay is 8500.0
*/