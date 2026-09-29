package StructuralDesignPattern.AdapterDesignPattern.GoodCode;

public class AirConditioner implements SmartDevice{

       @Override 
       public void turnOff(){
          System.out.println("AC has been turned off");
       }

       @Override 
       public void turnOn(){
          System.out.println("AC has been turned on");
       }

       public void connectViaBluetooth(){
          System.out.println("Air Conditioner is connected via Bluetooth");
       } 

       public void startCooling(){
          System.out.println("AC has started cooling");
       }

       public void stopCooling(){
          System.out.println("AC has stopped cooling");
       }

       public void disconnectBluetooth(){
          System.out.println("Air Conditioner has disconnected from Bluetooth");
       }
}
