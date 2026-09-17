package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

public class Main {
    public static void main(String args[]){
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();
        VehicleFactory marutiFactory = new MarutiFactory();
        Vehicle maruti = marutiFactory.createVehicle();
        maruti.start();
        maruti.stop();
        VehicleFactory toyotaFactory = new ToyotaFactory();
        Vehicle toyota = toyotaFactory.createVehicle();
        toyota.start();
        toyota.stop();
    }
}
