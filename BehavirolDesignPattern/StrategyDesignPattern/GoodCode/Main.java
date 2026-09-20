package BehavirolDesignPattern.StrategyDesignPattern.GoodCode;

/*
     Now, I can dynamically pass any payment method in Main 
     Similarly I can add any new Payment method easily without breaking of any design principles
*/
public class Main {
    public static void main(String args[]){
        PaymentStrategy creditCard = new CreditCard();
        PaymentStrategy payPal = new Paypal();
        PaymentStrategy crypto = new Crypto();

        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(crypto);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(payPal);
        paymentProcessor.processPayment();
    }
}
