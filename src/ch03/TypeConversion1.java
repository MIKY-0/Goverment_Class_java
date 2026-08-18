package ch03;

/**
 * 형변환이란?
 * 데이터의 타입을 다른 타입으로 변경하는 것.(자동형변환 , 강제형변환)
 */
public class TypeConversion1 {
    public static void main(String[] args) {
        int intDataBox = 100;
        double doubleDataBox;

        // 자동형변환.
        doubleDataBox = intDataBox; // 8바이트 상자 = 4바이트 상자 (8바이트 <-- 4바이트)
        System.out.println(doubleDataBox);

        // 강제형변환.
        final double PI = 3.14159;
//      int intBox = PI; 컴파일러가 오류 캐치! 컴파일러 입장에서 오류라고 생각.(코드작성시점 + ctrl + S : 컴파일시점)
        int intBox = (int)PI; // 위코드에서 (int)해줘야 개발자가 강제형변환 하겠다는걸 컴파일러에게 알림.

        // 연습 1.
        double interestRate;
        int discount;

        interestRate = 15.5;
        discount = (int)interestRate;


    } // end of main
} // end of main
