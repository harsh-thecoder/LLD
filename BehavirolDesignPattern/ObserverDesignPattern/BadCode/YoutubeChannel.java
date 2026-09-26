package BehavirolDesignPattern.ObserverDesignPattern.BadCode;
import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<YoutubeSubscriber> subscribers = new ArrayList<>();
    String video;

    public void addSubscriber(YoutubeSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void uploadNewVideo(String Video){
        this.video = Video;
    }

    public void notifySubscribers(){
        for(YoutubeSubscriber subscriber : subscribers){
            System.out.println("Notifying " + subscriber + " about the upload of a new video " + video);
        }
    }
}
