package ch06;

public class IfTest2 {
    public static void main(String[] args) {
        // 만약 ~ 라면 if else 구문. if(조건식) {실행코드}  else {실행코드}
        int age = 20;

        // if else구문 - 두가지 실행코드중 하나는 반드시 실행됨.
        if(age >= 19) {
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자");
        }
        System.out.println("프로그램 종료");
    } // end of main
} // end of class
