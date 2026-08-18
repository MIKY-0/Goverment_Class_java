package exercise;

public class Ex3 {
    public static void main(String[] args) {
        // 할인된 가격을 화면에 출력.
        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 3 / 10.0; // 30% 할인.

        // 1. 할인 계산식 찾아서 준비.
        double dcPrice = ORIGINAL_PRICE - ORIGINAL_PRICE * DISCOUNT_RATE; // ORIGINAL_PRICE * (1 - 할인율) 해도됨.

        // 2. 할인된 계산 금액을 변수에 담아 화면에 정수로 출력.
        System.out.println("원가 : " + ORIGINAL_PRICE);
        System.out.println("할인가 : " + dcPrice);

    } // end of main
}// end of class
