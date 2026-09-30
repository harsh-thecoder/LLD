package StructuralDesignPattern.FacadeDesignPattern;

/*
    It is mainly used to give a simplified user interface and all the complexities are being handled by facade
*/
public class Main {
    public static void main(String[] args) {
        MediaFacade mediaFacade = new MediaFacade();
        mediaFacade.performAction("playmusic");
        mediaFacade.performAction("playvideo");
        mediaFacade.performAction("viewimage");
    }
}
