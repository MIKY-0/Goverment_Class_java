package ch08;

import java.util.Scanner;

public class MenuChoice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coffee = 2500;

        while(true) {
            System.out.print("아메리카노(잔당 2500원) 몇잔 주문하시겠습니까? " +
                    "(3잔 이상 주문시 피라미드 스탬프 발급) - ");
            int cnt = scanner.nextInt();

            if(0 < cnt && cnt < 3) {
                System.out.printf("총 %d잔 주문.  결제 금액 : %d원" , cnt , coffee * cnt);
                break;
            } else if(cnt >= 3) {
                System.out.printf("총 %d잔 주문하셨습니다. 결제 금액 : %d원\n피라미드 스탬프 발급\n"
                                    , cnt , cnt * coffee);
                    for(int i = 0; i < 5; i++) {
                        for(int j = 0; j < 4 - i; j++) System.out.print(" ");
                        for(int k = 0; k < 2 * i + 1; k++) System.out.print("*");
                        System.out.println();
                    }
                    break;
            } else {
                System.out.println("수량을 잘못 입력하였습니다. 1잔 이상 주문하세요.");
            }
        }
    }
}
