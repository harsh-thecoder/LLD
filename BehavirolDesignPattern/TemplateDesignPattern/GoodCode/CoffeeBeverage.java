package BehavirolDesignPattern.TemplateDesignPattern.GoodCode;

public class CoffeeBeverage extends Beverage{
    @Override 
    public void brew(){
        System.out.println("Brewing Coffee");
    }

    @Override 
    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }
}
