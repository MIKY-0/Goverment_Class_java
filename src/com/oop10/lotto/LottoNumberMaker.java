package com.oop10.lotto;

import java.util.Random;

public class LottoNumberMaker {
    // static 변수 활용.
    // 난수 생성기 하나만 만들어서 계속 사용.
    private static Random random = new Random();

    // static 메서드 - 1 ~ 45까지 무작위 번호 추출.
    public static int makeNumber() {
        return random.nextInt(45) + 1;
    }
}
