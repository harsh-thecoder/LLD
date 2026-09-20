package BehavirolDesignPattern.StrategyDesignPattern.BadCode2;

public class PaymentProcessor {
    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("CreditCard")){
            CreditCard creditCard = new CreditCard();
            creditCard.processPayment();
        } else if(paymentMethod.equals("PayPal")){
            Paypal paypal = new Paypal();
            paypal.processPayment();
        } else if(paymentMethod.equals("crypto")){
           Crypto crypto = new Crypto();
           crypto.processPayment();
        } else{
            System.out.println("Payment Method not supported");
        }
    }
}
