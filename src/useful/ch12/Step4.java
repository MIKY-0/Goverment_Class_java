package useful.ch12;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Step4 {
    public static void main(String[] args) {
//        LocalDateTime tempNow = LocalDateTime.now();
//        System.out.println(tempNow);

        LocalTime start = LocalTime.of(9 , 0);
        LocalTime end = LocalTime.of(11 , 30);

        // 두 시각 사이의 간격을 Duration객체로 만들수 있음.
        Duration work = Duration.between(start , end);
        System.out.println("총 : " + work.toMinutes() + "분");
        // toMinutes() : 2시간 30분 --> 150분으로 표현.

        // Part가 붙은 메서드
        System.out.println("총 : " + work.toHoursPart() + "시간"); // '시간'만 추출.
        System.out.println("총 : " + work.toMinutesPart() + "분"); // '분'만 추출.
    }
}
