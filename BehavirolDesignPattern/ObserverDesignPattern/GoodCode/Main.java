package BehavirolDesignPattern.ObserverDesignPattern.GoodCode;

public class Main {
    public static void main(String args[]){
        YoutubeChannelImpl channel = new YoutubeChannelImpl();

        YoutubeSubscriber alice = new YoutubeSubscriber("Alice");
        YoutubeSubscriber bob = new YoutubeSubscriber("Bob");

        EmailSubscriber harsh = new  EmailSubscriber("Harsh");

        channel.addSubscriber(alice);
        channel.addSubscriber(bob);
        channel.addSubscriber(harsh);

        channel.uploadNewVideo("Learn LLD");

        channel.removeSubscriber(bob);
        channel.uploadNewVideo("Learn HLD also");
    }
}
