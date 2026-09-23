package BehavirolDesignPattern.MediatorDesignPattern.GoodCode;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder,int amount);
}
