package useful.ch12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Step6 {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(2000 , 1 , 28 );
        System.out.println("1. 생일 요일 : " + birth.getDayOfWeek().getDisplayName(TextStyle.FULL , Locale.KOREAN));

        LocalDate today = LocalDate.of(2026 , 8 , 7);
        LocalDate christmas = LocalDate.of(2026 , 12 , 25);
        LocalDateTime time = LocalDateTime.of(2025 , 5 , 13 , 14 , 30);
        DateTimeFormatter clock = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        Period age = Period.between(birth , today);

        System.out.println("2. 만 나이 : " + age.getYears());
        System.out.println("3. 태어난지 총 며칠? : " + ChronoUnit.DAYS.between(birth , today) + "일");
        System.out.println("4. 오늘부로 크리스마스까지 D-"  + ChronoUnit.DAYS.between(today , christmas));
        System.out.println(time.format(clock));
    }
}
