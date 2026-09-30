package StructuralDesignPattern.FacadeDesignPattern;

public class MusicPlayer {
    public void initializeAudioDrivers(){
        System.out.println("Initializing Audio Drivers");
    }

    public void decodeAudio(){
        System.out.println("Decoding the Audio");
    }

    public void startPlayBack(){
        System.out.println("Starting play back");
    }
}
