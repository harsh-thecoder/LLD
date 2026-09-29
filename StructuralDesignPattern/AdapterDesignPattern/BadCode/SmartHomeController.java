package StructuralDesignPattern.AdapterDesignPattern.BadCode;

public class SmartHomeController {
    public void controlDevice(String deviceType){
        if(deviceType.equals("AirConditioner")){
            System.out.println("Connecting to Air conditioner via Bluetooth");
        } else if(deviceType.equals("SmartLight")){
            System.out.println("Connecting to Smart light via wifi");
        } else if(deviceType.equals("CoffeeMachine")){
            System.out.println("Connecting to Coffee Machine via Zigbee");
        } else{
            System.out.println("Device type not supported");
        }
    }
}
