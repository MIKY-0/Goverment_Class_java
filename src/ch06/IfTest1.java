package ch06;

public class IfTest1 {
    public static void main(String[] args) {
        // 만약 ~ 라면 -> if , if else , if else if else
        // 주어진 조건에 따라서 실행이 다르게 이뤄지도록 구현.
        boolean flag = true;

        if (flag) { // 단독 if구문.
            System.out.println("주어진 식이 ture이면 실행됨");
        } // end of if

        System.out.println("프로그램 종료");

        // ★★★★중요★★★★
        // 단독 if구문은 수행 구문이 실행될 수 있고 안될 수 있음.

    } // end of main
}  // end of class
