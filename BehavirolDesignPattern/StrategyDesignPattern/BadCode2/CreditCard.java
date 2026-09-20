package BehavirolDesignPattern.StrategyDesignPattern.BadCode2;

public class CreditCard implements PaymentMethod{
    @Override 
    public void processPayment(){
        System.out.println("Processing CreditCard payment...");
    }
}
