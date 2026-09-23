package BehavirolDesignPattern.MediatorDesignPattern.GoodCode;

public class ExtendedAuctionHouse extends  AuctionHouse{
    private Long biddingEndTime;
    public ExtendedAuctionHouse(Long biddingEndTime){
        this.biddingEndTime = biddingEndTime;
    }

    @Override 
    public void placeBid(Bidder bidder,int amount){
        if(System.currentTimeMillis() > biddingEndTime){
            System.out.println("Bidding time is over. No more bids.");
            return;
        }

        System.out.println("LOG : " + bidder.getName() + " is bidding for " + amount);
        super.placeBid(bidder, amount);
    }
}
