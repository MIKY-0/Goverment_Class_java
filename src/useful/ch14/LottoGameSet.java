package useful.ch14;

import java.util.*;

public class LottoGameSet {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while(lotto.size() < 6) {
            int num = random.nextInt(45) + 1;
            lotto.add(num);
            count ++;
        }
        System.out.println("이번주 로또 번호 : " + lotto);
        System.out.println("while문 반복횟수 : " + count);

        System.out.println("=======================");
        // ArrayList생성자 안에 Set계열을 넣어서 List계열 객체 생성 가능.
        List<Integer> sortedLotto = new ArrayList<>(lotto); // 순서가 없었던(Set)lotto를 ArrayList로 형변환해서 순서생성.
        System.out.println(sortedLotto);

        // 오름차순 정렬.
        Collections.sort(sortedLotto);
        System.out.println("오름차순 정렬 로또 번호 : " + sortedLotto);

        // 내림차순 정렬.
        Collections.reverse(sortedLotto);
        System.out.println("내림차순 정렬 로또 번호 : " + sortedLotto);

    }
}
