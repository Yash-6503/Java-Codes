package com.blc;

//ELC 

public class BowlerDetails
{
    public static void main(String args[])
    {
        Bowler bowler = new Bowler();

        bowler.bowlerDetails("Sachin",10,5,750,463);
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}

/*  Tested with Positive Values
Bowler Details
Name : Sachin
Wickets : 10
Matches : 5
Balls Bowled : 750
Runs Conceded : 463
Bowling Average : 46.00
Strike Rate : 0.00
*/

/*  Tested with Negative Values
Error Invalid Input Wickets
Matches : 5
Error Invalid Input Balls Bowled
Runs Conceded : 463
Error Invalid Input Wickets
Error Invalid Input Balls Bowled
*/