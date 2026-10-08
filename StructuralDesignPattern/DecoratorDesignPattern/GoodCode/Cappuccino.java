package StructuralDesignPattern.DecoratorDesignPattern.GoodCode;

public class Cappuccino implements Coffee{
    @Override 
    public String getDescription(){
        return "Making Cappuccino ";
    }

    @Override 
    public double getCost(){
        return 10.2;
    }
}
