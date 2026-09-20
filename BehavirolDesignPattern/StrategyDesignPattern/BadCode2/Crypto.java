package BehavirolDesignPattern.StrategyDesignPattern.BadCode2;

public class Crypto implements PaymentMethod{
    @Override 
    public void processPayment(){
        System.out.println("Processing Crypto payment...");
    }
}
