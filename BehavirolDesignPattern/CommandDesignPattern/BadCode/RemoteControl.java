package BehavirolDesignPattern.CommandDesignPattern.BadCode;

public class RemoteControl {
    private TV tv;
    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public void pressOnButton(){
        tv.turnOn();
    }

    public void pressOffButton(){
        tv.turnOff();
    }

    public void pressChangeChannelButton(int channel){
        tv.changeChannel(channel);
    }

    public void pressChangeVolumeButton(int volume){
        tv.changeVolume(volume);
    }

    public void pressOnChangeVolumeAndChannelButtonTogether(int volume,int channel){
        tv.changeChannel(channel);
        tv.changeVolume(volume);
    }
}
