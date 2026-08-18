package ch08;

import java.util.Scanner;

public class MenuChoice4 {
    public static void main(String[] args) {
       // 스캐너 활용해서 문자열로 값 전달받기.
        Scanner scanner = new Scanner(System.in);

        // nextInt()는 정수만 입력받기 때문에 nextInt() 다음코드에 nextLine()이 있다면
        // \n를 버려주는 코드를 작성.
        int menuNumber = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine(); // 문자열 받기.
        System.out.println("name : " + name);
        System.out.println("menu : " + menuNumber);

    } // end of main
} // end of class
