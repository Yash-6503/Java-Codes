package pkg.blc3;

public class BankTransferPayment extends Payment
{
    @Override
    public void processPayment()
    {
        System.out.println("Processing bank transfer payment");
    }   
}