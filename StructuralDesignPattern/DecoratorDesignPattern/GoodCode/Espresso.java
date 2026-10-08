package StructuralDesignPattern.DecoratorDesignPattern.GoodCode;

public class Espresso implements Coffee{
    @Override 
    public String getDescription(){
        return "Making Espresso ";
    }

    @Override 
    public double getCost(){
        return 5.2;
    }
}
