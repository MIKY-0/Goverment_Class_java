package ch03;

public class ConstatntTest3 {
    public static void main(String[] args) {
       // 직사각형의 넓이를 구하는 코드 작성. 상수 활용.
        final int HEIGHT = 6;
        final int WIDTH = 8;
        int S = HEIGHT * WIDTH;

        System.out.printf("직사각형의 가로 : %d \n직사각형의 세로 : %d \n직사각형 넓이 : %d" , HEIGHT , WIDTH , S);
        } // end of main
} // end of class
