package BehavirolDesignPattern.VisitorDesignPattern.GoodCode;

/*
    This makes it alot loosely coupled
    This makes adding a new section easily
    It has Double Dispatch Magic (variations on Visiting methods like (diagnosis,billing) and patients like (child,adult)
    can be achieved)
*/
public class Main {
   public static void main(String[] args) {
        Visitor billingVisitor = new BillingVisitor();
        Visitor diagnosisVisitor = new DiagnosisVisitor();

        Patient patients[] = {
            new ChildPatient(),
            new AdultPatient(),
            new SeniorPatient()
        };

        for(Patient patient : patients){
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }

        // Other Way of Implementation
        // Patient childPatient = new ChildPatient();
        // Patient adultPatient = new AdultPatient();
        // Patient seniorPatient = new SeniorPatient();

        // childPatient.accept(diagnosisVisitor);
        // childPatient.accept(billingVisitor);
        // adultPatient.accept(diagnosisVisitor);
        // adultPatient.accept(billingVisitor);
        // seniorPatient.accept(diagnosisVisitor);
        // seniorPatient.accept(billingVisitor);
   }

}
