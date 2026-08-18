package com.oop6;

public class AccountMainTest {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(6000);
        account.showInfo();

        /*
         접근 제한자가 필요한 이유.
         협업 코드에서 내가 타인의 코드를 또는 타인이 나의 코드를 잘못 건드려서
         에러가 생길 수 있음을 방지하려고.
         아래처럼 balance변수에 직접 접근해버리면 값이 overwrite됨.
         그래서 우리는 private를 사용해서 외부에서는 필드가 안보이게 설정하는게 좋다.
         */

//        account.balance = 10000;
        System.out.println("========================");
        account.showInfo();

    }
}
