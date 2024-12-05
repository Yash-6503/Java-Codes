//BLC class of BankManagementSystem -> Account.java

package pkg.blc2;

public class Account
{
    String accounNumber;
    double balance;

    public Account(String accounNumber, double balance)
    {
        this.accounNumber = accounNumber;
        this.balance = balance;
    }

    public String getAccountNumber()
    {
        return accounNumber;
    }    

    public double getBalance(){
        return balance;
    }

    public Account generateStatement()
    {
        System.out.println("Account Number: "+accounNumber+"\nBalance: "+balance);
        return new Account(accounNumber,balance);
    }
}