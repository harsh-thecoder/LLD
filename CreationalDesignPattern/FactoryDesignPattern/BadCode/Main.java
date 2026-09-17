package BadCode;

public class Main{
    public static void main(String args[]){
        vehicle vehicle1 = new Car();
        vehicle1.start();
        vehicle1.stop();
        vehicle vehicle2 = new Truck();
        vehicle2.start();
        vehicle2.start();
    }
}