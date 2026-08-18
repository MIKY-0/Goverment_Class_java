package exercise;

public class Ex1 {
    // 메인함수. 코드실행의 시작점.
    public static void main(String[] args) {
//        연습 문제
//        1. 데이터 10, 100, 200 을 변수 선언과 동시에 초기화를 하고 화면에 출력해 보세요.
        int n1 = 10;
        int n2 = 100;
        int n3 = 200;

//        2. int ageBox 상자에 20을 담아 보세요
        int ageBox = 20;

//        3. ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮겨 보세요
        int temp = ageBox;
        ageBox = 30;

//        4. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭 해보세요
        int a = 1;
        int b = 3;
        int t;
        t = a;
        a = b;
        b = t;

    }   // end of main
} // end of class
