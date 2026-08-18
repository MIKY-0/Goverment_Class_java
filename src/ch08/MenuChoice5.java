package ch08;

import java.util.Scanner;

public class MenuChoice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int SELECT = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int EXIT = 0;
        String name = null;

        while (true) {
            System.out.print("1.등록\t2.조회\t3.수정\t4.삭제\t0.종료\n 입력 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(name == null && 2 <= choice && choice <= 4) {
                System.out.println("등록된 이름이 없습니다. 등록 먼저 해주세요.");
                continue;
            }

            if (choice == CREATE) {
                // name 변수에 스캐너 사용해서 이름 등록 기능 구현.
                if(name != null) {
                    System.out.println("이미 이름이 등록 되어있습니다.");
                    continue;
                }
                System.out.println("등록을 선택했습니다.");
                System.out.print("이름 등록 : ");
                name = scanner.nextLine();
            } else if (choice == SELECT) {
                // name에 담겨진 값을 출력하는 기능 구현.
                System.out.println("조회를 선택했습니다.");
                System.out.println("등록된 이름 : " + name);
            } else if (choice == UPDATE) {
                // name을 수정하는 기능 구현.
                System.out.println("수정을 선택했습니다.");
                System.out.print("수정할 이름 : ");
                name = scanner.nextLine();
                System.out.println("이름이 " + name + "으로 수정됐습니다. ");
            } else if (choice == DELETE) {
                // name을 삭제하는 기능 구현.
                System.out.println("삭제를 선택했습니다.");
                System.out.printf("이름(%s)이 삭제됐습니다." , name);
                name = null;
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
