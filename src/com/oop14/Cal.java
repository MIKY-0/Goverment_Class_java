package com.oop14;

public class Cal {

    public int sum(int n1 , int n2) {
        return n1 + n2;
    }

    public int multiply(int n1 , int n2) {
        return n1 * n2;
    }
}


class ChildCal extends Cal{
    public int minus(int n1 , int n2) {
        return n1 - n2;
    }

    @Override
    public int multiply(int n1 , int n2) {
        System.out.println("Child의 multiply 호출");
        if(n1 == 0 || n2 == 0) {
            System.out.println("0을 입력하지 마시오.");
        }
        return n1 * n2;
    }

}
