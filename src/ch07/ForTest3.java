package ch07;

public class ForTest3 {
    public static void main(String[] args) {
        // 1 ~ 100까지 수 중 홀수의 총합.

        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 반복문의 카운터변수를 2씩 증가.
        for(int i = 0; i < 10; i += 2) {
            System.out.println("2씩 증가 + " + i);
        }

        // 문제 - 10 9 8 7 6 5 4 3 2 1 출력.
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }



    } // end of main
} // end of class
