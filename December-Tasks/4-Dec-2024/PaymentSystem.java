package pkg.blc3;

public class PaymentSystem 
{
    public static void main(String[] args) 
    {
        Payment genericPayment = new Payment() {}; 
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();
        Payment bankTransferPayment = new BankTransferPayment();

        System.out.println("Test Case 1: Generic Payment");
        genericPayment.processPayment();
        
        System.out.println("\nTest Case 2: Credit Card Payment");
        creditCardPayment.processPayment();

        System.out.println("\nProcessing Multiple Payments:");
        processMultiplePayments(genericPayment, creditCardPayment, payPalPayment, bankTransferPayment);
    }

    public static void processMultiplePayments(Payment... payments) {
        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}

/*
Test Case 1: Generic Payment
Processing payment

Test Case 2: Credit Card Payment
Processing credit card payment

Processing Multiple Payments:
Processing payment
Processing credit card payment
Processing PayPal payment
Processing bank transfer payment
*/