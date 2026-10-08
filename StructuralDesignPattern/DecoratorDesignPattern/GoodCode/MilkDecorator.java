package StructuralDesignPattern.DecoratorDesignPattern.GoodCode;

public class MilkDecorator extends CoffeeDecorator{
    
    MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override 
    public String getDescription(){
        return "Adding Milk to the Coffee " + coffee.getDescription();
    }

    @Override 
    public double getCost(){
        return 15.6 + coffee.getCost();
    }
}
