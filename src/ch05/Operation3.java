package ch05;

/**
 * 복합대입연산자
 * 대입연산자와 다른 연산자가 함께 쓰이는 것.
 */
public class Operation3 {
    public static void main(String[] args) {
        int n1 = 100;
        n1 = n1 + 1;
        n1 = n1 + 1; // 원래 있던 값에 +1씩 해주고 있다.
        n1 = n1 + 1; // 귀찮음 -> 간소화하기 위해 복합대입연산자 활용.
        System.out.println();
        int score = 0; // 시작값 설정.

        // 점수 추가.
        score += 3;
        System.out.println("농구점수 3점 추가 : " + score);

        // 점수 감점.
        score -= 3;
        System.out.println("점수 3점 감점 : " + score);

        // 점수 2배 증가.
        score += 3;
        score *= 2;
        System.out.println("점수 3점 추가후 2배 : " + score);

        // 점수 1/2 감소.
        score /= 2;
        System.out.println("점수 1/2 감점 : " + score);

    } // end of main
} // end of class
