package BehavirolDesignPattern.StrategyDesignPattern.GoodCode;

public class Crypto implements PaymentStrategy{
    @Override 
    public void processPayment(){
        System.out.println("Processing Crypto payment...");
    }
}
