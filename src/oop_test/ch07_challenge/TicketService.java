package oop_test.ch07_challenge;

public class TicketService {
    private PricePolicy pricePolicy;

    public TicketService(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public void reserve(String movieTitle , int price) {
        Ticket ticket = new Ticket(movieTitle, price);
        System.out.printf("----------------에약완료----------------\n" +
                "영화 제목 : %s | 정가 : %d | 할인가격 : %d" , movieTitle , price , pricePolicy.calculate(price));
    }
}
