package StructuralDesignPattern.AdapterDesignPattern.BadCode;

/*
    It has many issues like
    It has alot of if else conditions (can be solved with mutliple class along with adapter etc)
    Alot of logic is exposed (can be solved by separate classes)
    The main issue is when a device has to be connected with usb at one place and with hdmi at other place
    Any new thing which comes up will always requires it's separate logic handling in it's separate class
*/
public class Main {
    public static void main(String[] args) {
        SmartHomeController smartHomeController = new SmartHomeController();
        smartHomeController.controlDevice("AirConditioner");
        smartHomeController.controlDevice("SmartLight");
        smartHomeController.controlDevice("CoffeeMachine");
        smartHomeController.controlDevice("MyDevice");
    }
}
