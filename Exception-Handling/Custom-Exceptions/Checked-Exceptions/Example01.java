// Program to handle custom checked exception.
// package com.classes;

import java.util.Scanner;

class NotEligibleForVote extends Exception {
    public NotEligibleForVote(String message) {
        super(message);
    }
}

public class Example01 {
    public static void main(String[] args) {
        try(
            Scanner sc = new Scanner(System.in);
        ) {
            
            System.out.println("Voting Eligibility Checker...");
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Congratulations!! your are Eligible to Vote..");
            } else {
                throw new NotEligibleForVote("OOPs!! You are not Eligilbe to Vote..");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}


/* Output:
 * 1.
 * Enter your age :
 * 18
 * Congratulations!! your are Eligible to Vote..
 * 
 * 2.
 * Voting Eligibility Checker...
 * Enter your age :
 * 12
 * NotEligibleForVote: OOPs!! You are not Eligilbe to Vote..
 */