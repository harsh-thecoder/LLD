package BehavirolDesignPattern.CommandDesignPattern.BadCode;

/*
    If Any new functionality comes then that has to be added in RemoteControl 
    Whereas RemoteControl should be just used for controls and not for logic handling etc
*/
public class Main {
    public static void main(String args[]){
        TV tv = new TV();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.pressOnButton();
        remoteControl.pressChangeChannelButton(105);
        remoteControl.pressChangeVolumeButton(5);
        remoteControl.pressOffButton();
    }
}
