package StructuralDesignPattern.FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        MediaFacade mediaFacade = new MediaFacade();
        mediaFacade.performAction("playmusic");
        mediaFacade.performAction("playvideo");
        mediaFacade.performAction("viewimage");
    }
}
