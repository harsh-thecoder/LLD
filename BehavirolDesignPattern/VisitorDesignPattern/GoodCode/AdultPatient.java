package BehavirolDesignPattern.VisitorDesignPattern.GoodCode;

public class AdultPatient implements Patient{
    @Override 
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
