package BehavirolDesignPattern.StateDesignPattern.GoodCode;

public class RedState implements TrafficLightState{
    private String color;
    public RedState(){
        this.color = "RED";
    }

    @Override 
    public void next(TrafficLightContext context){
        context.setState(new GreenState());
        System.out.println("Switched light from " + color + " to " + context.getColor());
    }

    @Override 
    public String getColor(){
        return color;
    }
}
