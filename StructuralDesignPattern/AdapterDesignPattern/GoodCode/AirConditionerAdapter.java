package StructuralDesignPattern.AdapterDesignPattern.GoodCode;

/*
    So, now we can use this class without impacting Air Conditioner class in any case
    We can even name this as AirConditionerBluetoothAdapter or AirConditionerWifiAdapter without touching actual AC class
*/
public class AirConditionerAdapter implements SmartDevice{
       private AirConditioner airConditioner;
       public AirConditionerAdapter(AirConditioner airConditioner){
           this.airConditioner = airConditioner;
       } 

       @Override 
       public void turnOn(){
          airConditioner.connectViaBluetooth();
          airConditioner.startCooling();
       }

       @Override 
       public void turnOff(){
          airConditioner.disconnectBluetooth();
          airConditioner.stopCooling();  
       }
}
