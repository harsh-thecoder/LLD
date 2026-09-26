package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern.GoodCode;

/*
    In any flow where we want chain like structure 
    where if one person/dependency is not there 
    then by default system moves to other ones there we use this pattern
*/
public class Main {
    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        
        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        int leaveDays = 5;
        System.out.println("Employee has requested leave for " + leaveDays + " days.");
        supervisor.processLeaveRequest(leaveDays);
    }
}
