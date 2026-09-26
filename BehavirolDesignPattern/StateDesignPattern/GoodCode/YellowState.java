package BehavirolDesignPattern.StateDesignPattern.GoodCode;

public class YellowState implements TrafficLightState{
    private String color;
    public YellowState(){
        this.color = "Yellow";
    }

    @Override 
    public void next(TrafficLightContext context){
        context.setState(new RedState());
        System.out.println("Switched light from " + color + " to " + context.getColor());
    }

    @Override 
    public String getColor(){
        return color;
    }
}
