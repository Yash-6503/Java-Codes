//BLC class of BankManagementSystem -> SavingsAccount.java

package pkg.blc2;

public class SavingsAccount extends Account
{
    double interestRate;

    public SavingsAccount(String accounNumber, double balance, double interestRate)
    {
        super(accounNumber,balance);
        this.interestRate = interestRate;
    }

    @Override
    public SavingsAccount generateStatement()
    {
        System.out.println("Account Number: "+accounNumber+"\nBalance: "+balance+"\nInterest Rate: "+interestRate);
        return new SavingsAccount(accounNumber,balance,interestRate);
    }
}