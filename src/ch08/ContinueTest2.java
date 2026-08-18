package ch08;

public class ContinueTest2 {
    public static void main(String[] args) {
    // 1층 ~ 15층 까지 엘리베이터가 올라감. 단, 4층은 미신때문에 층수를 세지않고 건너뜀.
        for(int floor = 1; floor <= 15; floor++) {
            if(floor == 4) continue;
            System.out.println(floor + "층 도착");
        }

    } // end of main
} // end of class
