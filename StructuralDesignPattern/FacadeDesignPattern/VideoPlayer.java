package StructuralDesignPattern.FacadeDesignPattern;

public class VideoPlayer {
    public void setupRenderingEngine(){
        System.out.println("Setting up Rendering Engine");
    }

    public void loadVideoFile(){
        System.out.println("Loading up video file");
    }

    public void playVideo(){
        System.out.println("Playing the Video");
    }
}
