package BehavirolDesignPattern.VisitorDesignPattern.BadCode;

public class ChildPatient {
    public void diagnosis(){
        System.out.println("Diagnosing a child");
    }

    public void billing(){
        System.out.println("Calculating billing for a child patient");
    }
}
