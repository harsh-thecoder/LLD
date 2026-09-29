package StructuralDesignPattern.AdapterDesignPattern.GoodCode;

public class SmartLightAdapter implements SmartDevice{
      private SmartLight smartLight;
      
      public SmartLightAdapter(SmartLight smartLight){
           this.smartLight = smartLight;
      }

      @Override 
      public void turnOn(){
          smartLight.connectViaWifi();   
          smartLight.turnOn();
      }

      @Override 
      public void turnOff(){
          smartLight.disconnectWifi();  
          smartLight.turnOff();
      }
}
