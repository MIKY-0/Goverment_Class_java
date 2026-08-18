package useful.ch13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStore {
    public static void main(String[] args) {
        // 방법 1 : ArrayList 타입 선언
        ArrayList<String> list1 = new ArrayList<>();

        // 방법 2 : List 타입 선언.
        List<String> list2 = new ArrayList<>();

        // 추가.
        list1.add("사과"); // 맨 끝에 추가.
        list1.add(1 , "포도"); // 인덱스 1 위치에 추가.

        // 조회.
        list1.get(0);
        list1.size(); // 실제 안에 들어가있는 요소의 개수.
        list1.contains("사과"); // "사과" 포함여부 -> true / false
        list1.indexOf("사과"); // "사과" 인덱스번호 반환 -> 없으면 -1반환.

        // 삭제.
        list1.remove("사과"); // 값을 찾아서 삭제.
        list1.remove(0); // 인덱스 번호로 삭제.
        list1.clear(); // 전체삭제.

        // 확인.
        list1.isEmpty(); // list1에 요소가 있는지 없는지 -> true / false

        System.out.println("=================================================================");

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        Iterator<String> it = list2.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
