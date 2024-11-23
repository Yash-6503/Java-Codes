package com.blc;

//BLC

public class Bowler
{
    private String name;
    private int wickets;   
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded)
    {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage()
    {
        if(runs_conceded > 0 && wickets > 0){
            double avg = runs_conceded / wickets;
            System.out.printf("Bowling Average : %.2f\n",avg);
        }else if(runs_conceded <= 0 && wickets > 0){
            System.out.println("Error Invalid Input Runs Conceded");
        }else if(runs_conceded > 0 && wickets <= 0){
            System.out.println("Error Invalid Input Wickets");
        }else{
            System.out.println("Error Invalid Input Runs Conceded and Wickets");
        }
    }

    public void computeStrikeRate()
    {
        if(runs_conceded > 0 && balls_bowled > 0){
            double strikeRate = runs_conceded / balls_bowled;
            System.out.printf("Strike Rate : %.2f",strikeRate);
        }else if(runs_conceded <= 0 && balls_bowled > 0){
            System.out.println("Error Invalid Input Runs Conceded");
        }else if(runs_conceded > 0 && balls_bowled <= 0){
            System.out.println("Error Invalid Input Balls Bowled");
        }else{
            System.out.println("Error Invalid Input Runs Conceded and Balls Bowled");
        }
    }

    public void showStatistics()
    {
        System.out.println("Bowler Details");
        System.out.println("Name : "+name);
        System.out.println(wickets <= 0 ? "Error Invalid Input Wickets" : "Wickets : "+wickets);
        System.out.println(matches <= 0 ? "Error Invalid Input Matches" : "Matches : "+matches);
        System.out.println(balls_bowled <=0 ? "Error Invalid Input Balls Bowled" : "Balls Bowled : "+balls_bowled);
        System.out.println(runs_conceded <= 0 ? "Error Invalid Input Runs Conceded" : "Runs Conceded : "+runs_conceded);
    }
}