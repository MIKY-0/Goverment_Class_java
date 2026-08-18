package ch01;

/**
 * 여러줄 주석 .
 * ctrl + alt + L : 코드 정렬 단축키
 * <p>
 * 프로그래밍 세상과의 첫 인사.
 * 화면에 문자열 'Hello World' 출력하기.
 * '//' : 한줄주석.(컴파일러가 무시하는 영역.)
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); // 명령어의 끝은 세미콜론으로 표시.
        System.out.println(); // 출력 후 다음 라인으로 넘어감.(line feed.)

        // 화면에 0 ~ 9까지 출력.
        System.out.println(0); // ctrl + D : 해당 줄 복사.
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
    } // end of main
} // end of class
