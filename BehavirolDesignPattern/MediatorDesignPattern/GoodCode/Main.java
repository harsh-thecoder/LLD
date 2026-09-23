package BehavirolDesignPattern.MediatorDesignPattern.GoodCode;

/*
    Any timing logic or any other logic can be easily added with Mediator Design Pattern
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Long biddingTime = System.currentTimeMillis() + 5000;
        AuctionMediator auctionHouse = new ExtendedAuctionHouse(biddingTime);
        Bidder bidder1 = new Bidder("Alice", auctionHouse);
        Bidder bidder2 = new Bidder("Bob", auctionHouse);
        Bidder bidder3 = new Bidder("Charlie", auctionHouse);
        auctionHouse.placeBid(bidder1,100);
        Thread.sleep(2000);
        auctionHouse.placeBid(bidder2,200);
        Thread.sleep(5000);
        auctionHouse.placeBid(bidder3,300);



        // AuctionMediator auctionHouse = new AuctionHouse();
        // Bidder bidder1 = new Bidder("Alice", auctionHouse);
        // Bidder bidder2 = new Bidder("Bob", auctionHouse);
        // Bidder bidder3 = new Bidder("Charlie", auctionHouse);
        // auctionHouse.registerBidder(bidder1);
        // auctionHouse.registerBidder(bidder2);
        // auctionHouse.registerBidder(bidder3);
        // bidder1.placeBid(100);
        // bidder1.placeBid(150);
        // bidder1.placeBid(200);
    }
}
