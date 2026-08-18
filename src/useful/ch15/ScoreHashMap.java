package useful.ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ScoreHashMap {
    public static void main(String[] args) {
        Map<String , Integer> scores = new HashMap<>();

        // 추가. 중복된 key값을 넣는다면 덮어쓰기가 됨.(업데이트 기능과 유사)
        scores.put("철수" , 90);
        scores.put("영희" , 85);
        scores.put("민준" , 92);

        // 조회.
        System.out.println(scores.get("철수"));
        System.out.println(scores.get("없음"));

        // 포함여부.
        System.out.println(scores.containsKey("철수"));
        System.out.println(scores.containsValue(85));

        // 삭제.
        scores.remove("철수");
        System.out.println(scores);

        // 크기 확인.
        System.out.println(scores.size());

        // 전체순회.
        for(String n : scores.keySet()) {
            System.out.println(n + " : " + scores.get(n) + "점");
        }
    }
}
