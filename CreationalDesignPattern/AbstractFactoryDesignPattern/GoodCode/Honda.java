package CreationalDesignPattern.AbstractFactoryDesignPattern.GoodCode;

public class Honda implements Vehicle {
    public void start() {
        System.out.println("Honda is starting");
    }
    public void stop() {
        System.out.println("Honda is stopping");
    }
}
