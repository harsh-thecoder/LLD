package StructuralDesignPattern.CompositeDesignPattern.GoodCode;

public class AirConditioner implements SmartComponent{
    @Override 
    public void turnOn(){
        System.out.println("Air conditioner is On");
    }

    @Override 
    public void turnOff(){
        System.out.println("Air conditioner is Off");
    }
}
