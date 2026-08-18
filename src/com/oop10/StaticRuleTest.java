package com.oop10;

public class StaticRuleTest {
    private String version = "1.0.0";
    private static String appName = "로또번호 생성기";

    // 인스턴스 메서드
    public String getVersion() {
        System.out.println(appName);
        System.out.println(version);
        makeMessage(); // 이 메서드는 static영역에 이미 올라온 상태라서 객체생성없이 바로 호출 가능.
        return version;
    }

    // static 메서드
    public static String makeMessage() {
        System.out.println(appName);

        // 사용불가이유 : 아래 일반변수들은 객체생성이 안된상태에서 이 static메서드를 실행하면 일반변수를 호출할
        // 객체대상이 없기 때문.
//        System.out.println(version); // 인스턴스변수. 사용불가
//        System.out.println(getVersion()); // 사용불가
//        System.out.println(this); //사용불가

        return appName + " 입니다";
    }
}
