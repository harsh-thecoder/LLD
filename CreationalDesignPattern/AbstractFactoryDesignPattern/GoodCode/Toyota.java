package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

public class Toyota implements Vehicle {
    public void start() {
        System.out.println("Toyota is Starting");
    }
    public void stop() {
        System.out.println("Toyota is Stopping");
    }
}
