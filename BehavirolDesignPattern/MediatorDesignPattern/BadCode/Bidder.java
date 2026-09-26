package BehavirolDesignPattern.MediatorDesignPattern.BadCode;

public class Bidder {
    private String name;
    public Bidder(String name){
        this.name = name;
    }

    public void placeBid(int amount,Bidder[] bidders){
        System.out.println(name + " placed a bid of " + amount);
        for(Bidder bidder : bidders){
            if(bidder != this){
                bidder.receiveBid(this,amount);
            }
        }
    }

    public void receiveBid(Bidder bidder,int amount){
        System.out.println(name + " is notified that " + bidder.name + " has placed a bid of " + amount);
    }
}
