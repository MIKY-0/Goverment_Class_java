package oop_test.ch07_challenge;

public class Ticket {
    private String movieTitle;
    private int price;

    public Ticket(String movieTitle , int price) {
        this.movieTitle = movieTitle;
        this.price = price;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public int getPrice() {
        return this.price;
    }
}
