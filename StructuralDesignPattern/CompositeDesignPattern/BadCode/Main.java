package StructuralDesignPattern.CompositeDesignPattern.BadCode;

/*
    It follows a hierarchy so surely we can make use of that instead doing things individually for every appliances
*/
public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice();
        smartDevice.turnOnRoom1();
        smartDevice.turnOnRoom2();
        smartDevice.turnOffRoom1();
        smartDevice.turnOffRoom2();
        smartDevice.turnOnFloor1();
        smartDevice.turnOnFloor2();
        smartDevice.turnOffFloor1();
        smartDevice.turnOffFloor2();
        smartDevice.turnOnHouse();
        smartDevice.turnOffHouse();
    }
}
