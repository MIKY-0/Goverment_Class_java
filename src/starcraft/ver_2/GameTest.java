package starcraft.ver_2;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ZEALOT_TO_ZERGLING = 1; // 공격 : 질럿 -> 저글링
        final int ZERGLING_TO_ZEALOT = 1; // 공격 : 저글링 -> 질럿
        final int MARINE_TO_ZEALOT = 1; // 공격 : 마린 -> 질럿
        final int ZEALOT = 1; // 질럿 선택

        final int ZEALOT_TO_MARINE = 2; // 공격 : 질럿 -> 마린
        final int ZERGLING_TO_MARINE = 2; // 공격 : 저글링 -> 마린
        final int MARINE_TO_ZERGLING = 2; // 공격 : 마린 -> 저글링
        final int ZERGLING = 2; // 저글링 선택

        final int MARINE = 3; // 마린 선택
        final int INFO = 3; // 내 상태창 확인

        final int EXIT = 0; // 게임 종료
        final int RECHOOSE = 0; // 캐릭터 재선택

        Zealot z1 = new Zealot("질럿1");
        Zergling zg1 = new Zergling("저글링1");
        Marine m1 = new Marine("마린1");

        System.out.println("★★★★★★★★★★★★스타크래프트 시작★★★★★★★★★★★★");

        while(true) {
            System.out.println();
            System.out.print("캐릭터 선택\n1. 질럿\t2. 저글링\t3.마린\t0.종료\n선택 : ");
            int choice = scanner.nextInt();

            if(choice == ZEALOT) {
                System.out.print("누구를 공격하시겠습니까? " +
                        "1. 저글링\t2.마린\t3.질럿 상태확인\t0. 캐릭터 재선택\n선택 : ");
                int attackChoice = scanner.nextInt();

                if(attackChoice == ZEALOT_TO_ZERGLING) z1.attack(zg1);
                    else if(attackChoice == ZEALOT_TO_MARINE) z1.attack(m1);
                    else if(attackChoice == INFO) z1.showInfo();
                    else if(attackChoice == RECHOOSE) continue;
                    else System.out.println("잘못 입력하였습니다.");

            }
            else if(choice == ZERGLING) {
                System.out.print("누구를 공격하시겠습니까? " +
                        "1. 질럿\t2.마린 \t3.저글링 상태확인\t0. 캐릭터 재선택\n선택 : ");
                int attackChoice = scanner.nextInt();

                if(attackChoice == ZERGLING_TO_ZEALOT) zg1.attack(z1);
                else if(attackChoice == ZERGLING_TO_MARINE) zg1.attack(m1);
                else if(attackChoice == INFO) zg1.showInfo();
                else if(attackChoice == RECHOOSE) continue;
                else System.out.println("잘못 입력하였습니다.");

            }
            else if(choice == MARINE) {
                System.out.print("누구를 공격하시겠습니까?" +
                        " 1. 질럿\t2.저글링 \t3.마린 상태확인\t0. 캐릭터 재선택\n선택 : ");
                int attackChoice = scanner.nextInt();

                if(attackChoice == MARINE_TO_ZEALOT) m1.attack(z1);
                else if(attackChoice == MARINE_TO_ZERGLING) m1.attack(zg1);
                else if(attackChoice == INFO) m1.showInfo();
                else if(attackChoice == RECHOOSE) continue;
                else System.out.println("잘못 입력하였습니다.");

            }
            else if(choice == EXIT){
                System.out.println("게임 종료");
                return;
            } else {
                System.out.println("잘못 입력했습니다. 다시입력!");
            }
        }
    }
}