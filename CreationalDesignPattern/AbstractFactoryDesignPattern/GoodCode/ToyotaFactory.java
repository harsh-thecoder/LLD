package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

public class ToyotaFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
