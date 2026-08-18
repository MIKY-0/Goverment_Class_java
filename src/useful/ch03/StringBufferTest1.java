package useful.ch03;

public class StringBufferTest1 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");

        // 1. StringBuffer 사용법
        StringBuffer buffer1 = new StringBuffer(str1);
        System.out.println(System.identityHashCode(buffer1));

        // 2. 문자열을 더해보자.
        buffer1.append(str2);
        System.out.println(buffer1);
        System.out.println(System.identityHashCode(buffer1));

        // 3. StringBuffer --> String으로 형변환.
        String str3 = buffer1.toString(); // toString() 호출 즉시 String타입으로 변환.

        /*
         결론
         StringBuffer를 사용하면 String처럼 문자열을 계속 생성하는게 아니라 기존에 있던 문자열공간을 활용하여
         내부상태값을 바꿈. -> StringBuffer가 사용하는 문자열공간은 동적공간이므로 가능.
         */

    }
}
