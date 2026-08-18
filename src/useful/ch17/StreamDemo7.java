package useful.ch17;

import java.util.Arrays;
import java.util.List;

// reduce - 최종연산
// reduce( 초기값 , (매개변수) -> 식 ).  초기값이 없으면 Optional 타입 변수에 넣음.
public class StreamDemo7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = numbers.stream()
                .reduce(0 , (a , b) -> a + b);
        System.out.println(sum);

    }
}
