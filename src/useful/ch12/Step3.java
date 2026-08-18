package useful.ch12;

import java.time.LocalDate;
import java.time.Period;

public class Step3 {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(2000 , 5 , 12);
        LocalDate today = LocalDate.of(2026 , 8 , 7);

        // Period 클래스. 년 , 월 , 일 3개의 int를 하나로 묶어 담아두는 상자.
        Period age = Period.between(birth , today);

        System.out.println("나이 : " + age.getYears() + "세");
        System.out.println("정확히 : " + age.getYears() + "년 " + age.getMonths() + "개월 " + age.getDays() + "일");

        // Period객체를 그대로 출력하면 안됨.
        System.out.println(age); // 사람이 읽는 형식이 아님.


    }
}
