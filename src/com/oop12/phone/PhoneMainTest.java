package com.oop12.phone;

import java.util.Scanner;

public class PhoneMainTest {
    public static void main(String[] args) {
        Person[] person = new Person[100];
        Scanner scanner = new Scanner(System.in);

        person[0] = new Person("카리나", "1111");
        person[1] = new Person("장원영", "2222");
        person[2] = new Person("유나", "3333");
        person[3] = new Person("설윤", "4444");
        person[4] = new Person("김채원", "5555");


        while (true) {
            System.out.println();
            System.out.println("★★★★★★★★전화번호부★★★★★★★★");
            System.out.print("1. 생성 2. 조회 3. 수정 4. 삭제 5. 종료   ---->  ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                Work.create(scanner, person);
            } else if (choice == 2) {
                System.out.print("1. 이름 조회  2. 전화번호 조회   ---->  ");
                int choice2 = scanner.nextInt();
                scanner.nextLine();

                if (choice2 == 1) {Work.selectByName(scanner, person);}
                else if (choice2 == 2) {Work.selectByPhone(scanner, person);}
                else{System.out.println("잘못입력하였습니다.");}
                }
            }
        }
    }

