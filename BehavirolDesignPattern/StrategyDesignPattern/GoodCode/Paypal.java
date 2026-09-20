package BehavirolDesignPattern.StrategyDesignPattern.GoodCode;

public class Paypal implements PaymentStrategy{
    @Override 
    public void processPayment(){
        System.out.println("Processing Paypal payment...");
    }
}
