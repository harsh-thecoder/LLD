package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern.GoodCode;

public class Supervisor extends Approver{
    @Override 
    public void processLeaveRequest(int leaveDays){
        if(leaveDays <= 3){
            System.out.println("Supervisor has approved the Leave");
        } else if(nextApprover != null){
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
