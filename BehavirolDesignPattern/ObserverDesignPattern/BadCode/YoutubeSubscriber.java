package BehavirolDesignPattern.ObserverDesignPattern.BadCode;

public class YoutubeSubscriber {
    private YoutubeSubscriber name;
    public YoutubeSubscriber(YoutubeSubscriber name){
        this.name = name;
    }

    public void subscribe(YoutubeChannel channel){
        channel.addSubscriber(name);
    }

    public void watchVideo(YoutubeChannel channel){
        System.out.println(name + " is watching the video " + channel.video);
    }
}
