package pkg.blc3;

public class PayPalPayment extends Payment
{
    @Override
    public void processPayment()
    {
        System.out.println("Processing PayPal payment");
    }   
}