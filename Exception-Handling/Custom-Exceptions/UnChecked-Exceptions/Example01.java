// Program to handle custom unchecked exception.
// package com.classes;

import java.util.Scanner;

class NotEligibleForVote extends RuntimeException {
    public NotEligibleForVote(String message) {
        super(message);
    }
}

public class Example01 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            System.out.println("Voting Eligibility Checker...");
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Congratulations!! your are Eligible to Vote..");
            } else {
                throw new NotEligibleForVote("OOPs!! You are not Eligilbe to Vote..");
            }

    }
}

/*
 * Output:
 * 1.
 * Enter your age :
 * 18
 * Congratulations!! your are Eligible to Vote..
 * 
 * 2.
 * Voting Eligibility Checker...
 * Enter your age :
 * 14
 * Exception in thread "main" NotEligibleForVote: OOPs!! You are not Eligilbe to
 * Vote..
 * at Example01.main(Example01.java:23)
 */