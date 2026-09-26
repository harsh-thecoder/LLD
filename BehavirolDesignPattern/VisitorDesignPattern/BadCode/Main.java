package BehavirolDesignPattern.VisitorDesignPattern.BadCode;

/*
    Let's say we have interfaced patient by using template design pattern
    Even in that case also if say surgery gets added then it will be a very complex logic inside every section
    And it increase messyness of the code
    Here everyone should visit patient instead of patient visiting every service
*/
public class Main {
    public static void main(String[] args) {
        Object patient = new AdultPatient();

        if(patient instanceof ChildPatient){
            ((ChildPatient) patient).diagnosis();
            ((ChildPatient) patient).billing();
        } else if(patient instanceof AdultPatient){
            ((AdultPatient) patient).diagnosis();
            ((AdultPatient) patient).billing();
        } else{
            ((SeniorPatient) patient).diagnosis();
            ((SeniorPatient) patient).billing();
        }
    }
}
