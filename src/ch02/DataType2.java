package ch02;

/**
 * 문자 데이터 타입
 * char 자료형 크기는 2바이트.
 */

public class DataType2 {
    // 메인함수
    public static void main(String[] args) {

        // 기본 자료형 - 문자타입(사실은 정수형)
        // 문자를 저장할 때 사용. 단 하나의 문자만을 저장 가능.
        char charBox = '가';
//        char charBox2 = '가나'; <- [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] []
        System.out.println(charBox);
        System.out.println('A');
        System.out.println('B');
        System.out.println('C');
        System.out.println("==========================");
        char alphabetA = 'A';
        System.out.println(alphabetA);
        System.out.println((int)alphabetA);
        System.out.println((int)'K');
//        char alphabetB = "B";  "" 쌍따옴표는 문자가 아닌 문자열을 표현할 때 사용.
        // 고민 - 문자도 사실 정수형이라고 했으나 왜 화면에는 문자형태로 출력되는걸까?
        // 이유 : 문자표가 이미 컴퓨터 내부에 저장돼있음.

    } // end of main
} // end of class
