package StructuralDesignPattern.CompositeDesignPattern.BadCode;

public class SmartDevice {
    public void turnOnRoom1(){
        System.out.println("Turn on devices in Room 1");
    }
   
    public void turnOnRoom2(){
        System.out.println("Turn on devices in Room 2");
    }

    public void turnOffRoom1(){
        System.out.println("Turn off devices in Room 1");
    }
   
    public void turnOffRoom2(){
        System.out.println("Turn off devices in Room 2");
    }

     public void turnOnFloor1(){
        System.out.println("Turn on devices in Floor 1");
    }
   
    public void turnOnFloor2(){
        System.out.println("Turn on devices in Floor 2");
    }

    public void turnOffFloor1(){
        System.out.println("Turn off devices in Floor 1");
    }
   
    public void turnOffFloor2(){
        System.out.println("Turn off devices in Floor 2");
    }

    public void turnOnHouse(){
        System.out.println("Turn on devices of whole house");
    }

    public void turnOffHouse(){
        System.out.println("Turn off devices of whole house");
    }

}
