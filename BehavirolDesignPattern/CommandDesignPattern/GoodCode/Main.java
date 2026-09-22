package BehavirolDesignPattern.CommandDesignPattern.GoodCode;

/*
    With this Implementation any new change command can be easily integrated in the whole system
*/
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv, 105);
        Command changeSound = new ChangeSoundCommand(tv, 5);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(turnOn);
        remoteControl.setOffCommand(turnOff);
        remoteControl.setChangeVolumeCommand(changeSound);
        remoteControl.setChangeChannelCommand(changeChannel);
        remoteControl.pressOnButton();
        remoteControl.pressOffButton();
        remoteControl.pressChangeVolumeButton();
        remoteControl.pressChangeChannelButton();
    }
}
