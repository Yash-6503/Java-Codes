package com.blc;

//BLC

public class Batter
{
    private String name;
    private int runs;
    private int matches;
    private float battingAvg;

    public void batterDetails(String name, int runs, int matches)
    {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    public void computeBattingAverage()
    {
        if(runs > 0 && matches > 0){
            battingAvg = runs / matches;
            System.out.printf("Batting Average : %.2f",battingAvg);
        }else if(runs <= 0 && matches > 0){
            System.out.println("Error Invalid Input Runs");
        }else if(runs > 0 && matches <= 0){
            System.out.println("Error Invalid Input Matches");
        }else{
            System.out.println("Error Invalid Input Runs and Matches");
        }
    }

    public void getStatistics()
    {
        System.out.println("Batter Details");
        System.out.println("Name : "+name);
        System.out.println(runs <= 0 ? "Error Invalid Input Runs" : "Runs : "+runs);
        System.out.println(matches <= 0 ? "Error Invalid Input Matches" : "Matches : "+matches);
    }    
}