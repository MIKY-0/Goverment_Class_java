package ch01;

/** 복습
 * 변수란 값을 담을 수 있는 메모리.
 * 1. 변수의 선언.
 * 2. 변수에 값을 대입.
 * 3. 변수에 접근.(변수명을 알아야 함)
 */
public class Variable2 {
    // 메인함수. 코드 실행의 시작점.
    public static void main(String[] args) {
        // 변수를 만들 때 규칙.
        // 1. 대소문자를 명확히 구분하며 길이에 제한 없음.
        int age = 10; // 초기화 : 변수 선언과 동시에 값을 대입.
        // int age = 10;  같은 중괄호 영역안에서는 동일한 변수명 사용 X.
        int aGe = 10;
        int agE = 10;

        // 2. 자바에서 사용하는 예약어(int , double , while , List.....)는 사용 X.
        // 3. '_ , $' 를 제외한 모든 특수문자는 사용 X.
        int count_ = 10;
//        int count# = 10;
        int $_tel = 10;

    } // end of main
} // end of class
