package com.oop12.phone;

// C : 한명씩 생성.
// R : id 조회 , 이름 조회(중복되면 모두 조회) , 전화번호 조회 , 전체 목록 조회
// U : id는 자동부여이기 때문에 이름(중복된 이름이라면 이름조회로 먼저 보여주고 사용자가 id를 선택해서 수정할 사람 선택하게) , 전화번호만 수정 가능.
// D : id삭제 , 이름삭제 (중복된 이름이라면 이름조회로 먼저 보여주고 사용자가 id를 선택해서 삭제할 사람 선택하게) , 전화번호 삭제.
// 전체삭제는 안만들거임.

import java.util.Scanner;

public class Work {

    static int lastIndex = 5;

    // C 한명씩 생성.
    public static void create(Scanner scanner , Person[] person) {
        System.out.println("생성할 이름과 전화번호 입력해주세요.");
        System.out.print("이름 : ");    String name = scanner.nextLine().trim();
        System.out.print("전화번호 : ");   String phone = scanner.nextLine().trim();
        person[lastIndex] = new Person(name , phone);
        lastIndex++;
        System.out.println(name + "님이 추가되었습니다.");
    }

    // R 전체조회.
    public static void selectAll (Person[] person) {
        System.out.println("＠＠＠＠전체조회＠＠＠＠");
        for(int i = 0; i < lastIndex; i++) {
            person[i].showInfo();
        }
    }

    // R id 입력받아 조회.
    public static void selectById (Scanner scanner , Person[] person) {
        System.out.print("조회할 id를 입력해주세요 : ");
        int id = scanner.nextInt();

        for(Person p : person) {
            if(p.getId() == id) {
                p.showInfo();
            }
        }
    }

    // R 이름 입력받아 조회.
    public static void selectByName (Scanner scanner , Person[] person) {
        System.out.print("조회할 이름을 입력해주세요 : ");
        String name = scanner.nextLine().trim();

        for(Person p : person) {
            if(p == null) {break;}
            else if(p.getName().equals(name)) {p.showInfo();}
        }
    }

    // R 전화번호 입력받아 조회.
    public static void selectByPhone (Scanner scanner , Person[] person) {
        System.out.print("조회할 전화번호를 입력해주세요 : ");
        String phone = scanner.nextLine().trim();

        for(Person p : person) {
            if(p == null) {break;}
            else if(p.getPhoneNumber().equals(phone)) {p.showInfo();}
        }
    }

    // U 이름 수정.(중복된 이름이라면 이름 조회 후 사용자가 id를 선택하게끔)
    public static void UpdateName (Scanner scanner , Person[] person) {
        System.out.print("수정할 이름을 입력해주세요 : ");
        String name = scanner.nextLine();

        for(Person p : person) {
            if(p == null) {break;}
            else if (!p.getName().equals(name)) {
                System.out.println("입력하신 이름이 존재하지 않습니다.");
                return;
            }
        }
    }

    // U 전화번호 수정.
    public static void UpdatePhone (Scanner scanner , Person[] person) {

    }

    // D id찾아서 삭제.
    public static void DeleteById(Scanner scanner , Person[] person) {

    }

    // D 이름찾아서 삭제. (중복된 이름이라면 이름 조회 후 사용자가 id를 선택하게끔)
    public static void DeleteByName(Scanner scanner , Person[] person) {

    }

    // D 전화번호찾아서 삭제.
    public static void DeleteByPhone(Scanner scanner , Person[] person) {

    }





}
