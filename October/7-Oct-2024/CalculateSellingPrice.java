/*
Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, 
Rs. 350 in coloring and added new accessories worth Rs. 500. 
Rohan wants to make a profit of Rs. 1500 on selling the cycle. 
Find the selling price of the cycle. Write a java program to store 
all values and calculate and display the selling price.
*/

package com.classes;

public class CalculateSellingPrice
{
    public static void main(String args[])
    {
        int buying_price = 1200;
        int repair = 250;
        int coloring = 350;
        int accessories = 500;
        int To_make_profit = 1500;

        //find selling price and store values & display selling price

        int selling_price = buying_price + repair + coloring + accessories + To_make_profit;

        System.out.println("Selling Price of a Cycle is "+selling_price);
    }
}

/*
Selling Price of a Cycle is 3800
*/