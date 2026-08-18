package ch05;

/**
 * 조건연산자(삼항연산자)
 * 조건식 ? 결과1 : 결과2 -> 조건식이 true - 결과1 , false - 결과2
 */

public class Operation8 {
    public static void main(String[] args) {
        int num = 6; // 7이 홀수인지 짝수인지.
        // 조건식 ?
        char result1 = num % 2 == 0 ? '짝' : '홀';
        System.out.println("result1 : " + result1);

        boolean isOk = 5 > 3 ? true : false;
        System.out.println("isOk : " + isOk);

        // 두 정수중 큰 정수를 변수 max에 담자.
        int max = 10 > 1 ? 10 : 1;
        System.out.println("max : " + max);

        // n1과 n2를 비교해서 더 큰 수를 변수 max2에 담자.
        int n1 = 100;
        int n2 = 300;
        int max2;
        max2 = n1 > n2 ? n1 : n2;
        System.out.println("더 큰 정수 : " + max2);

    } // end of main
} // end of class
