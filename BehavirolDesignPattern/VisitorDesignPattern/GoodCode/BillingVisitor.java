package BehavirolDesignPattern.VisitorDesignPattern.GoodCode;

public class BillingVisitor implements Visitor{
    @Override
    public void visit(ChildPatient childPatient){
        System.out.println("Calculating billing of a Child patient");
    }

    @Override 
    public void visit(AdultPatient adultPatient){
        System.out.println("Calculating billing of an adult patient");
    }

    @Override 
    public void visit(SeniorPatient seniorPatient){
        System.out.println("Calculating billing of a Senior patient");
    }
}
