package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  나이 목록에서 18세 이상만 필터링하는 코드. - 두가지 방법.
 */
public class StreamDemo1 {
    public static void main(String[] args) {
//        List<Integer> ages = new ArrayList<>();
//        ages.add(20);
//        ages.add(50);
//        ages.add(7);

        // 방법 1.(향상 for문) 지금까지 배운 방식.
        List<Integer> ages = Arrays.asList(20 , 11 , 18 , 23 , 34 , 48 , 2);
        List<Integer> adultAges1 = new ArrayList<>();
        for(int a : ages) {
            if(a >= 18) {
                adultAges1.add(a);
            }
        }
        System.out.println("향상 for : " + adultAges1);

        // 방법 2. (Stream)
        List<Integer> adultAges2 = ages.stream()
                .filter(age -> age >= 18)
                .collect(Collectors.toList()); // 나중에라도 수정할 일이 생겼을 경우 collect.
        // 그게 아니라면 그냥 toList()


        System.out.println("stream : " + adultAges2);


    }
}
