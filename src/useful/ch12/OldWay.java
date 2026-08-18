package useful.ch12;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class OldWay {
    public static void main(String[] args) {
        // Date - JDK 1 버전에 만들어진 클래스.
        // 1. 현재시간 출력.
        Date now = new Date();
        System.out.println("현재시간 : " + now);  // --> 출력형식부터 문제 : 영어 요일과 월 이름이 섞여서
         // 화면에 그대로 못씀.

        // 2. Date로 특정 날짜 만들기.
        Date date =  new Date(2025 , 4 , 12);
        System.out.println("설정한 날짜 : " + date); // --> 3925년으로 나옴. Date의 연도는 1900을 기준으로 세기때문.
        // 2025년을 만드려면 2025가 아니라 125를 줘야됨.

        Date date2 =  new Date(125 , 4 , 12); // --> 5월로 나옴. Date의 달은 0부터 시작.
        // 위와 같은 계산하고 작성해야한다는 문제때문에 JDK 1.1부터 곧바로 Calendar클래스 생성.

        System.out.println("====================================");

        Calendar cal = Calendar.getInstance(); // new Calendar() <-- 싱글톤 패턴으로 구현돼있어 메서드로 호출해야함.
        cal.set(2025 , 4 , 12); // 2025.05.12
        System.out.println(cal.getTime());

        // 위 문제들을 해결하기 위해 8버전부터 java.time패키지 제공. 계산 필요없이 그대로 쓰면 됨.
        LocalDate localDate = LocalDate.of(2025 , 5 , 12);
        System.out.println("설정한 날짜2 : " + localDate);

    }
}
