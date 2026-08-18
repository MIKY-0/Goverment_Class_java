package useful.ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream API는 지연실행됨. 중간연산은 호출해도 그 즉시 실행되지 않고 최종연산이 호출될 때 비로소 한꺼번에 실행이 됨.
public class StreamLazyDemo3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);

        // 중간연산만 호출.
        System.out.println("[1] 중간연산만 호출 ");
        Stream<Integer> stream1 = numbers.stream()
                .filter(n -> {
                    System.out.println("[2] filter실행 : " + n);
                    return n % 2 == 1;
                });
        System.out.println("여기까지 출력된 filter 로그가 있을까요");
        System.out.println("[3] 최종연산 호출해보기");
        stream1.forEach(n -> System.out.println("forEach 구문 실행(최종연산)" + n));

    }
}
