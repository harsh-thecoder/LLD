package BehavirolDesignPattern.StrategyDesignPattern.BadCode1;

public class PaymentProcessor {
    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("CreditCard")){
            System.out.println("Processing Credit card payment...");
        } else if(paymentMethod.equals("PayPal")){
            System.out.println("Processing Paypal payment...");
        } else if(paymentMethod.equals("crypto")){
            System.out.println("Processing crypto payment...");
        } else{
            System.out.println("Payment Method not supported");
        }
    }
}
