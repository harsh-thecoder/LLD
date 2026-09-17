package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

public class HondaFactory implements VehicleFactory {
    public Vehicle createVehicle(){
        return new Honda();
    }
}
