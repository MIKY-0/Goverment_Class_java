package com.oop20;

public interface RemoteControl {
    // 1. 인터페이스 안에 선언된 필드는 모두 상수. final생략됨.
    public static final int MAX_VOLUME = 10; // public static final 생략 가능.

    // 2. 인터페이스 안에 선언되는 메서드는 자바 8버전 이후 default 제외하고 전부 추상메서드로 설계.
    void turnOn(); // public abstract 생략.
    public abstract void turnOff();

    void setVolume(int volume);
}
