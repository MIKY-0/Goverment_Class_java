package ch08;

public class ContinueTest1 {
    public static void main(String[] args) {
        // 다음 반복으로 넘어가는 continue.
        // 1 ~ 10까지 중 홀수만 출력.
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) continue; //이번 반복은 건너뜀.
            System.out.println(i);
        }
    } // end of main
} // end of class
