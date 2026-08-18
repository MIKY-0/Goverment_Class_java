package ch05;

/**
 * 논리연산자(&& , || , !)
 */

public class Operation6 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;

        // 1. 논리곱(&&) 둘다 참이면 true.
        boolean flag1 = (num1 > 0) && (num2 > 0);
        System.out.println(flag1);

        boolean flag2 = (num1 > 0) && (num2 < 0);
        System.out.println(flag2);

        // 2. 논리합(||) 둘다 거짓이면 false.
        boolean flag3 = (num1 > 0) || (num2 > 0);
        System.out.println(flag3);

        boolean flag4 = (num1 < 0) || (num2 < 0);
        System.out.println(flag4);

        System.out.println();
        // 부정 논리 연산자
        System.out.println(!true);

    } // end of main
}  // end of class
