package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

public class MarutiFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Maruti();
    }
}
