package CreationalDesignPattern.BuilderDesignPattern.GoodCode;

/*
    For using only few Parameters of a Constructor we have to write separate constructors
    And likewise alot of combinations can be there
    So, to avoid duplication of logic and to improve readability we use builder design Pattern
*/
public class Main {
    public static void main(String args[]) {
        Car.Carbuilder builder = new Car.Carbuilder();
        Car car1 = builder.setEngine("V8")
                .setColor("Blue")
                .setWheels(7)
                .setSunroof(true)
                .setNavigationSystem(false)
                .build();
        System.out.println(car1);   
    }     
}
