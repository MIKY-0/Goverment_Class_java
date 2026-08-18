package ch06;

// import : 외부 패키지를 가져옴.
import java.util.Scanner;

public class IfTest3_1 {
    public static void main(String[] args) {
        // Scanner : 사용자의 키보드 입력값을 받는 도구.
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();

        if(age <= 7) System.out.println("유아");
        else if(age <= 13) System.out.println("초등학생");
        else if(age <= 16) System.out.println("중학생");
        else if(age <= 19) System.out.println("고등학생");
        else System.out.println("성인");

        System.out.println("프로그램 종료");
    } // end of main
} // end of class
