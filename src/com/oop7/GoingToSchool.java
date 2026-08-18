package com.oop7;

// 코드 실행

import java.util.Scanner;

public class GoingToSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CHARGE = 0;
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int END = 5;
        System.out.print("학생 이름 입력 : ");
        String name = scanner.nextLine();

        // 객체생성 (등장 인물 준비)
        Student student = new Student(name , 5000);
        Rice rice = new Rice("김치볶음밥" , 3000);
        Bus bus133 = new Bus(133 , 1000);
        Subway line1 = new Subway(1 , 1400);

        while(true) {
            System.out.println("0. 잔액 충전 \t1. 밥먹기\t2.버스타기\t3.지하철타기 \t4.내 상태\t5.종료");
            System.out.print("메뉴선택 : ");
            int choice = scanner.nextInt();

            if(choice == 1) {
                student.eatRice(rice);
            } else if(choice == 2) {
                student.takeBus(bus133);
            } else if(choice == 3) {
                student.takeSubway(line1);
            } else if(choice == 4) {
                student.showInfo();
            } else if(choice == 5) {
                    break;
            } else if(choice == 0) {
                System.out.print("충전할 금액 : ");
                int chargeMoney = scanner.nextInt();
                student.charge(chargeMoney);
            }
            else {
                System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택해주세요.");
            }
        }
    }
}
