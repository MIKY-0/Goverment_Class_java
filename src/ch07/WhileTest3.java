package ch07;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        int sum = 0;
        // 문제1. 1 ~ 10까지 총합.


        // 문제2. 끝 값을 사용자의 입력을 받아 합하는 변수출력.
        System.out.print("마지막 정수 입력 : ");
        int end = scanner.nextInt();

        while(start <= end) {
            sum += start;
            start++;
        }
        System.out.println("sum : " + sum);

    } // end of main
} // end of class
