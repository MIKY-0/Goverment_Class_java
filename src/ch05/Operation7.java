package ch05;

/**
 *빠른 평가란?
 *  논리연산에서 첫번째 조건이 결과를 결정하는 경우, 두번째 조건을 평가하지 않는것.
 */

public class Operation7 {
    public static void main(String[] args) {
        int num = 5;
        int index = 0;

        // 논리곱(&&)을 사용한 빠른 평가.
        // 첫번째 조건이 false이기때문에 논리곱에서는 두번째 조건은 아예 평가(실행)하지 않음.
//        boolean result = ((num = num + 10) < 10) && ((index = index + 2) < 10);
        boolean result = ((num += 10) < 10) && ((index += 2) < 10);
        System.out.println("num : " + num);
        System.out.println("index : " + index);
        System.out.println("result : " + result);
        System.out.println("================================");

        // 논리합을 사용한 빠른 평가확인.
        // num은 15 , index는 0.
        boolean result2 = ((num = num + 10) < 10) || ((index = index + 2) < 10);
        System.out.println("num : " + num);
        System.out.println("index : " + index);
        System.out.println("result2 : " + result2);
        System.out.println("================================");

        // 논리합을 사용한 빠른 평가확인. 처음 조건에 true나왔으니 뒤 조건들 볼 필요 없음.
        // num은 25 , index는 2.
        boolean result3 = ((num = num + 10) > 10) || ((index = index + 2) < 10);
        System.out.println("num : " + num);
        System.out.println("index : " + index);
        System.out.println("result3 : " + result3);
        System.out.println("====================================");

        // 문제1. 빠른 평가 수식을 스스로 만들어보고 결과를 출력.
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        boolean result4 = ((d -= b) >= (c -= a)) && ((c -= b) <= (d -= a));
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println("result4 : " + result4);


        // a = 1 , b = 2 , c = 0 , d = 1
        boolean result5 = ((a += c) > (b += d)) && ((a += d) < (b += c));
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("result5 : " + result5);

    } // end of main
} // end of class
