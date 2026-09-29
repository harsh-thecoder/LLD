package StructuralDesignPattern.AdapterDesignPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
          AirConditionerAdapter airConditionerAdapter = new AirConditionerAdapter(new AirConditioner());
          SmartLightAdapter smartLightAdapter = new SmartLightAdapter(new SmartLight());
          airConditionerAdapter.turnOn();  
          airConditionerAdapter.turnOff();
          smartLightAdapter.turnOn();  
          smartLightAdapter.turnOff();  
    }
}
