package useful.ch12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Step5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2026 , 8 , 7 , 19 , 17);
        System.out.println(now); // 바로 사용자에게 보여주기에 무리가 있음.
        // 원하는 형식으로 포맷을 지정할 필요가 있다.

        DateTimeFormatter korean = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println(now.format(korean));

        DateTimeFormatter clock = DateTimeFormatter.ofPattern("a hh시 mm분" , Locale.KOREAN);
        System.out.println(now.format(clock));

        DateTimeFormatter log = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(log));
    }
}
