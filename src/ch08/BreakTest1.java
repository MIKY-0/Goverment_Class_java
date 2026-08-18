package ch08;

public class BreakTest1 {
    public static void main(String[] args) {
        // break - 중간에 멈추는 구문.
        // 만약 i가 7이 되면 for문을 나가라.
        for(int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
            if(i == 7) break;
        }
        System.out.println("=============================================");

        // 문제 1. while 사용해서 100 ~ 200까지 출력. 단, 151에 도달했다면 반복문 탈출.
        int a = 100;
        while(a <= 200) {
            System.out.println("a : " + a);
            a++;
            if(a == 151) break;  // return;
        }

    } // end of main
} // end of class
