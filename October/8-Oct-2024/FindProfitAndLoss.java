/*
Write a java program to find the profit and loss by following the formula
Profit and loss Formulas – 
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/

package com.classes;

public class FindProfitAndLoss
{
    public static void main(String args[])
    {
        double selling_price = Double.parseDouble(args[0]);
        double cost_price = Double.parseDouble(args[1]);


        double Profit = selling_price - cost_price;
        double Loss = cost_price - selling_price;

        double Profit_percent = (Profit / cost_price) * 100;
        double Loss_percent = (Loss / cost_price) * 100;

        System.out.println("Profit "+Profit);
        System.out.println("Loss "+Loss);

        System.out.println();
        System.out.printf("Profit percentage %.0f%%", Profit_percent);
        System.out.printf("\nLoss percentage %.0f%%", Loss_percent);
        
    }
}

/*
java FindProfitAndLoss.java 250 200
Profit 50.0
Loss -50.0

Profit percentage 25%
Loss percentage -25%
*/