package useful.ch12;

import java.time.Duration;
import java.time.LocalDateTime;

public class Step7 {
    public static void main(String[] args) {
        int sum = 0;
        LocalDateTime start = LocalDateTime.now();

        for(int i = 1; i <= 100000000; i++) {
            sum += i;
        }

        LocalDateTime end = LocalDateTime.now();

        Duration sumWork = Duration.between(start , end);
        System.out.println("총 작업 시간 : " + sumWork.toMillis() + "ms , 1 ~ 1억 까지 합 : " + sum);

    }
}
