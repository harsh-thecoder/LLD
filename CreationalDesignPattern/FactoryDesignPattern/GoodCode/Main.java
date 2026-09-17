package GoodCode;

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