package BehavirolDesignPattern.StrategyDesignPattern.BadCode1;

/*
    To have multiple payment options we are handling all the options in a single file without design pattern
    Any new method to be added will be a difficulty and OCP will get breaked
    This code is very messy as well
*/
public class Main {
    public static void main(String args[]){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard");
        paymentProcessor.processPayment("PayPal");
        paymentProcessor.processPayment("UPI");
    }
}
