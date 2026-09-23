package BehavirolDesignPattern.MediatorDesignPattern.BadCode;

/*
     There can be time addition to it like at what time bid was placed
     Notification logic can be added for other bidders
     Everything is tightly coupled as Bidder has to communicate between every other bidders
     Mediator will solve all the issue also any logic change can be easily integrated with mediator
*/
public class Main {
    public static void main(String[] args) {
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");
        Bidder[] bidders = {bidder1,bidder2,bidder3};
        bidder1.placeBid(500, bidders);
        System.out.println("\n");
        bidder2.placeBid(1000, bidders);
    }
}
