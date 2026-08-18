package exercise;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        char grade = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적 입력 : ");
        int score = scanner.nextInt();

        if (score < 0 || 100 < score) {
            System.out.println("잘못된 입력입니다. 성적은 0 ~ 100 사이로 입력해주세요.");
            return;
        }

        if (score < 60) {
            grade = 'F';
            System.out.println(grade + "학점 : 불합격입니다. 부족한 부분을 파악하고 추가학습이 필요해요..");
        } else if (score < 70) {
            grade = 'D';
            System.out.println(grade + "학점 : 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
        } else if ( score < 80) {
            grade = 'C';
            System.out.println(grade + "학점 : 괜찮은 성적이지만 더 높은 등급을 위해 노력해봅시다.");
        } else if (score < 90) {
            grade = 'B';
            System.out.println(grade + "학점 : 좋은성적입니다. 조금만 더 노력하면 A도 가능해요.");
        } else {
            grade = 'A';
            System.out.println(grade + "학점 : 우수한 성적이네요! 계속 좋은 성적 유지하세요.");
        }


//        if (90 <= score && score <= 100) {
//            grade = 'A';
//            System.out.println(grade + "학점 : 우수한 성적이네요! 계속 좋은 성적 유지하세요.");
//        } else if (80 <= score && score < 90) {
//            grade = 'B';
//            System.out.println(grade + "학점 : 좋은성적입니다. 조금만 더 노력하면 A도 가능해요.");
//        } else if (70 <= score && score < 80) {
//            grade = 'C';
//            System.out.println(grade + "학점 : 괜찮은 성적이지만 더 높은 등급을 위해 노력해봅시다.");
//        } else if (60 <= score && score < 70) {
//            grade = 'D';
//            System.out.println(grade + "학점 : 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
//        } else {
//            grade = 'F';
//            System.out.println(grade + "학점 : 불합격입니다. 부족한 부분을 파악하고 추가학습이 필요해요...");
//        }
    } // end of main
} // end of class
