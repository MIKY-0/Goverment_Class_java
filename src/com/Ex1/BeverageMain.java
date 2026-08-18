package com.Ex1;

import com.oop14.A;

import java.util.Scanner;

public class BeverageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Beverage americano = new Americano();
        Beverage latte = new Latte();

        while (true) {
            int choice;
            System.out.println("=======================");
            System.out.println("1. 아메리카노(3000원)\t2.라떼(4500원)\t3.주문완료");
            System.out.print("무엇을 주문하시겠습니까? --> ");
            choice = scanner.nextInt();

            if(choice == 1) {
                americano.prepare();
                americano.serve();
            } else if(choice == 2) {
                latte.prepare();
                latte.serve();
            } else if( choice == 3) {
                System.out.println("주문완료");
                break;
            } else {
                System.out.println("다시 입력해주세요");
            }

        }
    }
}