package BehavirolDesignPattern.VisitorDesignPattern.GoodCode;

public class DiagnosisVisitor implements Visitor{
    @Override
    public void visit(ChildPatient childPatient){
        System.out.println("Diagnosing a Child patient");
    }

    @Override 
    public void visit(AdultPatient adultPatient){
        System.out.println("Diagnosing an adult patient");
    }

    @Override 
    public void visit(SeniorPatient seniorPatient){
        System.out.println("Diagnosing a Senior patient");
    }
}
