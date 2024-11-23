package com.blc;

//BLC class

public class Customer
{
    private String bankName;
    private String bankCustomerName;
    private String bankAddress;
    private String bankIFSCCode;
    private int accountNumber;
    private int currentBalance;

    public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, int accountNumber, int currentBalance)
    {
        this.bankName = bankName;
        this.bankCustomerName = bankCustomerName;
        this.bankAddress = bankAddress;
        this.bankIFSCCode = bankIFSCCode;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }   

    public void withdraw(double amount)
    {
        if((currentBalance-amount) >= 1000 && amount > 0)
		{
			currentBalance-=amount;
			System.out.println("Transaction Successful.");
            currentBalance();
		}else if(amount <= 0){
            System.out.println("Invalid Input Amount");
            return;
        }
        else if(currentBalance <= 1000){
            System.out.println("Insufficient Balance Please maintain balance");
        }else if(amount <= 0){
            System.out.println("Invalid Input Amount");
            return;
        }
        else 
		{
			System.out.println("Maintain Minimum Balance Rs.1000.");
		}
    }

    public void Deposit(double amount)
    {
        if(amount > 0){
            currentBalance += amount;
            System.out.println("Deposited Successfully");
            // System.out.println("Available Balance : Rs."+currentBalance);
            currentBalance();
        }else{
            System.out.println("Invalid Input Amount");
        }
    }

    public void currentBalance()
    {
        if(currentBalance >= 1000){
            System.out.println("Available Balance : Rs."+currentBalance);
        }else{
            System.out.println("Maintain Minimum Balance Rs.1000.");
        }
    }

    public String displayDetails()
	{
		return currentBalance >= 1000 ?  "Details \n[ " +bankName+ ", Name :" +bankCustomerName+ ", Address :" +bankAddress+ ", IFSC :" +bankIFSCCode+ ", Account no :" +accountNumber+ ", Balance :" +currentBalance+ "]" : "Maintain Minimum Balance Rs.1000.";
	}
}