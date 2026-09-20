package BehavirolDesignPattern.StrategyDesignPattern.BadCode2;

/*
    We now made separation in multiple classes but still a new payment method will lead to breaking of OCP
    So, solution is Strategy Pattern
    Strategy Pattern is like factory of Behavirol Design Pattern
*/
public class Main {
    public static void main(String args[]){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard");
        paymentProcessor.processPayment("PayPal");
        paymentProcessor.processPayment("UPI");
    }
}
