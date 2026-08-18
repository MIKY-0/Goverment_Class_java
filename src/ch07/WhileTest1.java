package ch07;

public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) { // 무한루프 조심.
            System.out.println("i값 : " + i);
            // 조건식에 처리가 없다면 무한히 반복.
            i++;
        }
        System.out.println("============================");

        int num = 1;
        int sum = 0;
        while(num <= 10) {
            sum += num;
            num++; // 조건식 처리 필요.
        }
        System.out.println("sum : " + sum);

    } // end of main
} // end of class

