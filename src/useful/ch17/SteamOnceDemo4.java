package useful.ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamOnceDemo4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        Stream<Integer> stream = numbers.stream();

        System.out.println("첫번째 사용 : " + stream.count());
//        System.out.println("두번째 사용 : " + stream.count()); // 예외 발생. stream의 최종연산이 위에서 이미 됐음.
        System.out.println("두번째 사용(새로 생성) : " + numbers.stream().count());


    }
}
