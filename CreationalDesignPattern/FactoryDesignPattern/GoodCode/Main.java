package GoodCode;

/*
    For Object Creation all the logic was being kept in Main class itself
    So any new addition would be so difficult 
    So we created Factory Design Pattern for Proper handling of things
*/
public class Main{
    public static void main(String args[]){
        vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.start();
        vehicle1.stop();
        vehicle vehicle2 = VehicleFactory.getVehicle("Truck");
        vehicle2.start();
        vehicle2.start();
    }
}