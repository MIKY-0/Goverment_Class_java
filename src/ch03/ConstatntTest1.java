package ch03;

public class ConstatntTest1 {
    // 코드실행의 시작점.
    public static void main(String[] args) {
        int num = 10;
        num = 101;

        // 상수 사용해보기.
        // final 키워드를 사용하고 변수명에 이름을 작성할때 '대문자_'를 사용하는게 권장.
        final int MAX_NUM = 100;
//        MAX_NUM = 1;   한번 값이 정해지면 다시 변경 불가. (상수)

        // 원주율을 상수로 선언해보자.
        final double PI = 3.14159;
        final int R = 5;

        // 원의 둘레.
        double D = 2 * PI * R;

        // 원의 넓이.
        double S = PI * R * R;

        } // end of main
} // end of class
