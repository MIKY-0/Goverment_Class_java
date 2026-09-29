package oop_test.ch07_challenge;

public class Main {
    public static void main(String[] args) {
        PricePolicy pricePolicy = new WeekdayPricePolicy();
        TicketService ticketService = new TicketService(pricePolicy);

        ticketService.reserve("광해" , 15000);


    }
}
