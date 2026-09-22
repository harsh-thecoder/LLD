package BehavirolDesignPattern.CommandDesignPattern.BadCode;

public class TV {
    public void turnOn(){
        System.out.println("Turning on the TV");
    }

    public void turnOff(){
        System.out.println("Turning off the TV");
    }

    public void changeChannel(int channel){
        System.out.println("Changed channel to : " + channel);
    }

    public void changeVolume(int volume){
        System.out.println("Volume set to : " + volume);
    }


}
