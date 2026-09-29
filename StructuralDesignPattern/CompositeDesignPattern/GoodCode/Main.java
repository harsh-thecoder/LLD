package StructuralDesignPattern.CompositeDesignPattern.GoodCode;

/*
    We'll have common interface for all components
*/
public class Main {
    public static void main(String[] args) {
        SmartComponent airConditioner = new AirConditioner();
        SmartComponent airConditioner2 = new AirConditioner();
        SmartComponent smartLight = new SmartLight();
        SmartComponent smartLight2 = new SmartLight();

        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponent(airConditioner);
        room1.addComponent(smartLight);

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(airConditioner2);
        room2.addComponent(smartLight2);

        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);

        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponent(floor);

        System.out.println("Turning on all the lights of house : ");
        house.turnOn();

        System.out.println("Turning off all the lights of house : ");
        house.turnOff();
    }
}
