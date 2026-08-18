package ch06;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        // 키보드에서 값을 받을 도구.
        Scanner scanner = new Scanner(System.in);
        char result = 'F';

        System.out.print("성적 입력 : ");
        int score = scanner.nextInt();
        System.out.println("score : " + score);

        // 사용자가 값을 잘못 입력할 경우를 대비해 부적합한 값의 방어코드를 작성.
        // 문제. 90점 이상이면 A , 80점 이상이면 B , 70점 이상이면 C , 60점 이상이면 D , 59점 이하 F.

        // return - 제어문 종료.
        if (score < 0 || 100 < score) {
            System.out.println("잘못 입력됨. 점수는 0 ~ 100까지. ");
            return;
        }

        if (score >= 90) {
            result = 'A';
        } else if (score >= 80) {
            result = 'B';
        } else if (score >= 70) {
            result = 'C';
        } else if (score >= 60) {
            result = 'D';
        } else if (score <= 59) {
            result = 'F';
        }

        System.out.println("당신의 학점 : " + result);
    } // end of main
} // end of class
