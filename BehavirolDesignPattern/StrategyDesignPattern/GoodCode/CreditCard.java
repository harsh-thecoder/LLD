package BehavirolDesignPattern.StrategyDesignPattern.GoodCode;

public class CreditCard implements PaymentStrategy{
    @Override 
    public void processPayment(){
        System.out.println("Processing CreditCard payment...");
    }
}
