package ch08;

import java.util.Scanner;

public class MenuChoice3 {
    public static void main(String[] args) {
        // 도전. 잘못된 입력을 3번이상 입력시 강제종료. 단, 3회 이전에 올바른 메뉴입력을 했다면
        // 다시 0번으로 잘못된 입력 초기화.

        Scanner scanner = new Scanner(System.in);

        int badChoiceCnt = 0;
        boolean flag = true;
        final int CREATE = 1;
        final int SELECT = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int EXIT = 0;

        while (true) {

            System.out.print("1.등록\t2.조회\t3.수정\t4.삭제\t0.종료\n 입력 : ");
            int choice = scanner.nextInt();

            if(0 <= choice && choice <= 4) flag = true; // 올바른 입력(true)과 틀린 입력(false)을 전환해주는 코드.

            badChoiceCnt = flag ? 0 : badChoiceCnt; // 올바른 입력했으면 0번 초기화, 그게 아니면
            // 횟수 유지.

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
                break;
            } else {
                badChoiceCnt++;
                flag = false;
                if(badChoiceCnt >= 3) {
                    System.out.println(badChoiceCnt + "번 틀렸습니다. 강제 종료됩니다.");
                    return;
                }
                System.out.println("잘못입력하였습니다. 다시 입력해주세요. 기회가 " +
                        (3 - badChoiceCnt) + "번 남았습니다.");
            }
            System.out.println("------------------------");
        }
    } // end of main
} // end of class
