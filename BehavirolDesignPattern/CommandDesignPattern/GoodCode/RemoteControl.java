package BehavirolDesignPattern.CommandDesignPattern.GoodCode;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command changeVolumeCommand;
    private Command changeChannelCommand;
    public void setOnCommand(Command onCommand){
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand){
        this.offCommand = offCommand;
    }

    public void setChangeVolumeCommand(Command changeVolumeCommand){
        this.changeVolumeCommand = changeVolumeCommand;
    }

    public void setChangeChannelCommand(Command changeChannelCommand){
        this.changeChannelCommand = changeChannelCommand;
    }

    public void pressOnButton(){
        onCommand.execute();
    }

    public void pressOffButton(){
        offCommand.execute();
    }

    public void pressChangeVolumeButton(){
        changeVolumeCommand.execute();
    }

    public void pressChangeChannelButton(){
        changeChannelCommand.execute();
    }

}
