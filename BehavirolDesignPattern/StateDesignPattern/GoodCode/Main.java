package BehavirolDesignPattern.StateDesignPattern.GoodCode;

/*
    Logic has become alot decouple.
    So, adding any new state is not much tough task now
    It can be used anywhere where we feel like having a cycle kind of thing
*/
public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();
        trafficLightContext.next();
        trafficLightContext.next();
        trafficLightContext.next();
        trafficLightContext.next();
    }
}
