package BehavirolDesignPattern.StrategyDesignPattern.BadCode2;

public class Paypal implements PaymentMethod{
    @Override 
    public void processPayment(){
        System.out.println("Processing Paypal payment...");
    }
}
