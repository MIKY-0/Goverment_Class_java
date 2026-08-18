package ch08;

import java.util.Scanner;

public class MenuChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int SELECT = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int EXIT = 0;

        while (true) {
            System.out.print("1.등록\t2.조회\t3.수정\t4.삭제\t0.종료\n 입력 : ");
            int choice = scanner.nextInt();
            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == SELECT) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다.");
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다.");
            } else if (choice == EXIT) {
                System.out.println("종료를 선택했습니다. 프로그램을 종료합니다.");
                return; // break;
            } else {
                System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
            }
            System.out.println("------------------------");
        }

    } // end of main
} // end of class
