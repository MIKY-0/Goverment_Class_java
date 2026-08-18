package ch03;

/**
 * 형변환이란?
 * 데이터의 타입을 다른 타입으로 변경하는 것.(자동형변환 , 강제형변환)
 */
public class TypeConversion2 {
    public static void main(String[] args) {
        // 자동형변환 프리스타일로 코드 작성해보기. --> 결과출력
        // 강제형변환 프리스타일로 코드 작성해보기. --> 결과출력
        int a = 11;
        double b = 11.1111;

        int num1 = a + (int) b;
        double num2 = a + b;

        System.out.printf("num1 : %d\nnum2 : %.4f", num1, num2);

    } // end of main
} // end of main
