package BehavirolDesignPattern.StateDesignPattern.GoodCode;

public interface TrafficLightState {
    void next(TrafficLightContext trafficLightContext);
    String getColor();
}
