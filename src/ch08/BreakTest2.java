package ch08;

public class BreakTest2 {
    public static void main(String[] args) {
        // 문제 1. 1 ~ 100까지 반복문. 3배수만 출력.  50이상이면 반복문 종료.  for문 사용.
        for(int i = 1; i <= 100; i++) {
            if (i >= 50) break;
            if(i % 3 == 0) {
                System.out.println("i : " + i);
            }
        }
    } // end of main
} // end of class
