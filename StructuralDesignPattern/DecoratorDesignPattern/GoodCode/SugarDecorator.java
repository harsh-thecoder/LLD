package StructuralDesignPattern.DecoratorDesignPattern.GoodCode;

public class SugarDecorator extends CoffeeDecorator{
    SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override 
    public String getDescription(){
        return "Adding Sugar to the Coffee " + coffee.getDescription();
    }

    @Override 
    public double getCost(){
        return 20.4 + coffee.getCost();
    }
}
