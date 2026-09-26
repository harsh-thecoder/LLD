package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern.BadCode;

public class LeaveRequest {
    public void raiseLeaveRequest(int leaveDays){
        if(leaveDays <= 3){
            System.out.println("Supervisor approved the leave");
        } else if(leaveDays <= 7){
            System.out.println("Manager approved the leave");
        } else if(leaveDays <= 14){
            System.out.println("Director approved the leave");
        } else{
            System.out.println("Leave request denied");
        }
    }
}
