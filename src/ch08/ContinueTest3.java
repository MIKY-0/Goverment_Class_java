package ch08;

public class ContinueTest3 {
    public static void main(String[] args) {
        // 379 게임. 1 ~ 30까지 카운트. 3 , 7 , 9가 들어간 숫자는 "짝!" 외침.
        // 힌트. i의 일의 자리를 구하고 last변수에 담음. 1 , 2 , 짝! , 4 , 5 , 6 , 짝!.....

        for(int i = 1; i <= 70; i++) {
            int last = i % 10;
            int m = i / 10;

            // 삼항연산자 안써도 되지만 변수에 담아보고자 활용.
            boolean odd = (m == 3 || m == 7 || m == 9) ? true : false;
            boolean even = (last == 3 || last == 7 || last == 9) ? true : false;

            if (even) {
                System.out.println("짝!");
                continue;
            }
            if(odd) {
                System.out.println("짝!");
                continue;
            }

            System.out.println(i);
        }

        // 샘플 테스트 코드
        // 나머지 연산자와 10이라는 숫자를 활용하면 끝 자리 추출가능.
//        System.out.println(23 % 10); // 3
//        System.out.println(47 % 10); // 7


    } // end of main
} // end of class
