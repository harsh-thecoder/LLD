package BehavirolDesignPattern.MediatorDesignPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionHouse = new AuctionHouse();
        Bidder bidder1 = new Bidder("Alice", auctionHouse);
        Bidder bidder2 = new Bidder("Bob", auctionHouse);
        Bidder bidder3 = new Bidder("Charlie", auctionHouse);
        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);
        auctionHouse.registerBidder(bidder3);
        bidder1.placeBid(100);
        bidder1.placeBid(150);
        bidder1.placeBid(200);
    }
}
