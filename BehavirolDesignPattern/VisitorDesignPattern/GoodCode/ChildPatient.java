package BehavirolDesignPattern.VisitorDesignPattern.GoodCode;

public class ChildPatient implements Patient{
    @Override 
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
