package ch06;

public class IfTest3 {
    public static void main(String[] args) {
        // if else if 구문 - 주어진 조건이 여러개일때 많이 사용.
        int age = 27;

        if(age <= 7) System.out.println("유아");
        else if(age <= 13) System.out.println("초등학생");
        else if(age <= 16) System.out.println("중학생");
        else if(age <= 19) System.out.println("고등학생");
        else System.out.println("성인");

        System.out.println("프로그램 종료");
    } // end of main
} // end of class
