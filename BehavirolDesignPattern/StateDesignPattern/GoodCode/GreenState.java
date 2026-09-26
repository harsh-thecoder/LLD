package BehavirolDesignPattern.StateDesignPattern.GoodCode;

public class GreenState implements TrafficLightState{
    private String color;
    public GreenState(){
        this.color = "GREEN";
    }

    @Override 
    public void next(TrafficLightContext context){
        context.setState(new YellowState());
        System.out.println("Switched light from " + color + " to " + context.getColor());
    }

    @Override 
    public String getColor(){
        return color;
    }
}
