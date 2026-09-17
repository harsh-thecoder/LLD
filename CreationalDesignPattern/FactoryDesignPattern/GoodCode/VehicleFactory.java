package GoodCode;

public class VehicleFactory {
    public static vehicle getVehicle(String vehicleType){
        if(vehicleType == "Car"){
            return new Car();
        } else if(vehicleType == "Truck"){
            return new Truck();
        } else {
            throw new IllegalArgumentException("Unknown Vehicle Type");
        }
    }
}
