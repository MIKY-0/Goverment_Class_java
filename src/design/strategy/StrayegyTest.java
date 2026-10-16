package design.strategy;

public class StrayegyTest {
    public static void main(String[] args) {
        String msg = "hello Java 안녕";
        Encoder encoder = new Encoder(new UrlStrategy());
        encoder.setStrategy(new HexStrategy());
        System.out.println(encoder.encode(msg));
    }
}
