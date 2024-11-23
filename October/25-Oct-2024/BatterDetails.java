package com.blc;

//ELC 

public class BatterDetails
{
    public static void main(String args[])
    {
        Batter batter = new Batter();

        batter.batterDetails("Sachin",18000,463);
        batter.getStatistics();
        batter.computeBattingAverage();
    }
}

/*  Tested with Positive Values
Name : Sachin
Runs : 18000
Matches : 463
Batting Average : 38.00
*/

/*  Tested with Negative Values
Batter Details
Name : Sachin
Error Invalid Input Runs
Error Invalid Input Matches
Error Invalid Input Runs and Matches
*/
