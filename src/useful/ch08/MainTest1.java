package useful.ch08;

public class MainTest1 {
    public static void main(String[] args) {
        // 1단계 : 박싱과 언박싱을 직접 호출해서 확인해보자.
        int num = 3;
        Integer num2 = Integer.valueOf(3); // 박싱 : int -> Integer객체로 변환.
        int num3 = num2.intValue(); // 언박싱 : Integer -> int로 변환.

        System.out.println(num2);
        System.out.println(num3);

        // 자바 5버전부터 자동박싱,자동언박싱 제공.

        // 2단계 : 자동박싱 / 자동언박싱
        Integer num4 = 17; // 컴파일러가 오토박싱. 17(int) -> num4(Integer)
        int num5 = num4; // 컴파일러가 오토언박싱. num4(Integer) -> num5(int)
    }
}
