package BehavirolDesignPattern.CommandDesignPattern.GoodCode;

public class ChangeVolumeAndChannelButtonTogetherCommand implements Command{
    private TV tv;
    private int channel;
    private int volume;
    public ChangeVolumeAndChannelButtonTogetherCommand(TV tv, int channel,int volume){
        this.tv = tv;
        this.channel = channel;
        this.volume = volume;
    }

    @Override 
    public void execute(){
        tv.changeChannel(channel);
        tv.changeVolume(volume);
    }
}
