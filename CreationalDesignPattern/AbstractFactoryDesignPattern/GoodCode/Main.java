package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

/*
    In this flow wherever VehicleFactory is related to CarFactory
    Flow was like Main will call VehicleFactory which will be having all the If else logic
    But the Issue was If we have to add a new brand in VehicleFactory say it is 20 lines of code so for 20 vehicles => 400 lines
    Also that was Breaking Open Close Principle (OCP) as we were always adding the new changes in VehilceFactory itself
    So, we made VehicleFactory as abstract and it's components as factory
    So, now any new addition can be easily done 
*/
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
