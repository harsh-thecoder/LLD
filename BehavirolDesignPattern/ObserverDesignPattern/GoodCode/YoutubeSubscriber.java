package BehavirolDesignPattern.ObserverDesignPattern.GoodCode;

public class YoutubeSubscriber implements Subscriber{
    private String name;
    public YoutubeSubscriber(String name){
        this.name = name;
    }

    @Override 
    public void update(String video){
        System.out.println("scheduling notifiaction for " + name + " the video : " + video);
    }

}
