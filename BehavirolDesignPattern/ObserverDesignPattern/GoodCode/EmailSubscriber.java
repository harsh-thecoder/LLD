package BehavirolDesignPattern.ObserverDesignPattern.GoodCode;

public class EmailSubscriber implements Subscriber {
    private String email;
    public EmailSubscriber(String email){
        this.email = email;
    }

    @Override 
    public void update(String video){
        System.out.println("Sending email to " + email + " Video uploaded is : " + video);
    }
}
