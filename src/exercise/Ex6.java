package exercise;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int maxNumber = scanner.nextInt();

        int sum = 0;

        // ... 코드를 작성해주세요
        for(int i = 0; i <= maxNumber; i++) {
            if(i % 2 == 0) sum += i;
        }

        System.out.println("짝수의 합: " + sum);
        scanner.close();
    }
}
