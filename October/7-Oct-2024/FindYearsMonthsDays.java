/*
Write a program in java to input number of days. 
Find and display number of years, months and days.
*/

package com.classes;

public class FindYearsMonthsDays
{
    public static void main(String args[])
    {
        int days = Integer.parseInt(args[0]);
        int year, months, d;

        year = days/365;

        // months = (days/30)-year*12;
        months = (days%365)/30;

        d = (days%365)%30; // (500%365)=135, (135%30)=15 (15 days left

        System.out.println(year+" years "+months+" months "+d+" days.");

    }
}

/*
1 years 4 months 15 days.
*/
