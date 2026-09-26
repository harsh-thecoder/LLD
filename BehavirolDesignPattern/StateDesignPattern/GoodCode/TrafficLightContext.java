package BehavirolDesignPattern.StateDesignPattern.GoodCode;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;
    public TrafficLightContext(){
        this.trafficLightState = new RedState();
    }

    public void setState(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }

    public void next(){
        trafficLightState.next(this);
    }

    public String getColor(){
        return trafficLightState.getColor();
    }

}
