//BLC class of BankManagementSystem -> CheckingAccount.java

package pkg.blc2;

public class CheckingAccount extends Account
{
    double overdraftLimit;

    public CheckingAccount(String accounNumber, double balance, double overdraftLimit)
    {
        super(accounNumber,balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public CheckingAccount generateStatement()
    {
        System.out.println("Account Number: "+accounNumber+"\nBalance: "+balance+"\nOverdraft Limit: "+overdraftLimit);
        return new CheckingAccount(accounNumber,balance,overdraftLimit);
    }
}