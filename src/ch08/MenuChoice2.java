package ch08;

import java.util.Scanner;

public class MenuChoice2 {
    public static void main(String[] args) {
        // 도전. 프로그램 종료시 사용자가 메뉴를 누른 횟수 출력.

        Scanner scanner = new Scanner(System.in);

        int count = 0;
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
                System.out.println("메뉴를 총 " + count + "번 선택했습니다.");
                return; // break;
            } else {
                System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
                if(count >= 0) count--; // 처음 2번 잘못입력 -> 1번 제대로 입력 했을시 count가 -1.
                // count가 음수 나오면 안되므로 if문 작성.
            }
            count++;
            System.out.println("------------------------");
        }
    } // end of main
} // end of class
