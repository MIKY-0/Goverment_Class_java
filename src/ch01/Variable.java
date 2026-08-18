package ch01;

// 이 파일의 이름 : Variable.java 파일.

/**
 * 변수 : 변하는 수.(또는 변하는 데이터) (데이터 = 값)
 * 데이터(값)를 담는 메모리(상자).
 */

public class Variable {
    // 프로그램의 시작점.(코드 실행 시.)
    public static void main(String[] args) {
        // 1. 변수의 선언.
        int ageBox; // 정수값을 담을 수 있는 상자 선언.
        int telBox; // 정수값을 담을 수 있는 상자 선언.

        // 2. 변수에 값을 대입.
        ageBox = 30;

        // 3. 변수의 사용.
        System.out.println(ageBox);

        // 4. 변수는 변할 수 있는 수. ageBox를 재호출해서 100으로 덮어씜.
        ageBox = 100;

        // 5. 화면에 다시 변수 출력.
        System.out.println(ageBox);

    } // end of main
} // end of class
