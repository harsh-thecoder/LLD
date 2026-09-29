package StructuralDesignPattern.CompositeDesignPattern.GoodCode;

public class SmartLight implements SmartComponent{
       
       @Override 
       public void turnOff(){
          System.out.println("Smart Light has been turned off");
       }

       @Override 
       public void turnOn(){
          System.out.println("Smart Light has been turned on");
       }
}
