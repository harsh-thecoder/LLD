package BehavirolDesignPattern.CommandDesignPattern.GoodCode;

public class ChangeSoundCommand implements Command{
     private TV tv;
     private int volume;
     public ChangeSoundCommand(TV tv,int volume){
        this.tv = tv;
        this.volume = volume;
     }  

     @Override 
     public void execute(){
        tv.changeVolume(volume);
     }
}
