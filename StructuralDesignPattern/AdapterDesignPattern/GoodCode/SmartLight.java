package StructuralDesignPattern.AdapterDesignPattern.GoodCode;

public class SmartLight implements SmartDevice{

       @Override 
       public void turnOff(){
          System.out.println("Smart Light has been turned off");
       }

       @Override 
       public void turnOn(){
          System.out.println("Smart Light has been turned on");
       }

       public void connectViaWifi(){
          System.out.println("Smart Lightis connected via Wifi");
       } 

       public void disconnectWifi(){
          System.out.println("Smart Light has disconnected from Wifi");
       }
}
