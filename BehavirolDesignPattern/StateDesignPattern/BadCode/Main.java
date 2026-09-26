package BehavirolDesignPattern.StateDesignPattern.BadCode;

/*
    If a new state comes in then adding that in this same logic will be so tough
    Like blinking of light 
    Or adding a new light itself
*/
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        String currentColor = trafficLight.getColor();
        System.out.println("The current color of light is : " + currentColor);
        trafficLight.next();
        currentColor = trafficLight.getColor();
        System.out.println("The current color of light is : " + currentColor);
        trafficLight.next();
        currentColor = trafficLight.getColor();
        System.out.println("The current color of light is : " + currentColor);
    }
}
