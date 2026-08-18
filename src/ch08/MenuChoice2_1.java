package ch08;

import java.util.Scanner;

public class MenuChoice2_1 {
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

            switch (choice) {
                case CREATE :
                    System.out.println("등록을 선택했습니다.");
                    break;
                case SELECT :
                    System.out.println("조회를 선택했습니다.");
                    break;
                case UPDATE :
                    System.out.println("수정을 선택했습니다.");
                    break;
                case DELETE :
                    System.out.println("삭제를 선택했습니다.");
                    break;
                case EXIT :
                    System.out.println("종료를 선택했습니다. 프로그램을 종료합니다.");
                    System.out.println("메뉴 입력 횟수 : " + count);
                    return;
                default :
                    System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
                    if(count >= 0) count--;
            }
            count++;
            System.out.println("------------------------");
        }

    } // end of main
} // end of class
