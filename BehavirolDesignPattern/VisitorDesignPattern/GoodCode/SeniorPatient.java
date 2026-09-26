package BehavirolDesignPattern.VisitorDesignPattern.GoodCode;

public class SeniorPatient implements Patient{
    @Override 
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
