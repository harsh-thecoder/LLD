package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern.BadCode;

/*
    Alot of if else conditions 
    So, if more logic comes in each if else blocks then it will be highly messy code
*/
public class Main {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.raiseLeaveRequest(1);
        leaveRequest.raiseLeaveRequest(4);
        leaveRequest.raiseLeaveRequest(10);
        leaveRequest.raiseLeaveRequest(15);
    }
}
