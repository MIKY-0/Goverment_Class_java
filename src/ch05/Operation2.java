package ch05;

public class Operation2 {
    public static void main(String[] args) {
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3); // 결과가 1인 이유 : int / int라서 결과도 int.
        System.out.println(5 / 3.0); // 3을 double로 형변환.
        System.out.println(5 % 3);

        System.out.println();

        // 문제 1. (12 + 3) / 3을 화면에 출력. 단, 결과값을 변수에 담아서 출력.
        int result = (12 + 3) / 3;
        System.out.println("문제 1. (12 + 3) / 3 = " + result);

        // 문제 2. (25 % 2) 값을 화면에 출력.
        System.out.println("문제 2. 25 / 2 의 나머지 : " + 25 % 2);
        // 나머지 연산자는 해당값이 홀수인지 짝수인지 판별할때 유용.
        // 어떤수를 2로 나눴을때 나머지가 0 - 짝수 , 1 - 홀수.

        // 문제 3. 7896456 값이 홀수인지 짝수인지 화면에 1 또는 0으로 출력.
        int m = 7896456 % 2;
        System.out.println("문제 3. 7896456 / 2 의 나머지 : " + m);
    } // end of main
} // end of class
