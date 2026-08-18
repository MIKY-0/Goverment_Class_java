package useful.ch03;

public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        String s4 = new String("aaa");

        // == : 참조 비교.
        // Object의 equals() 기본동작은 주소값 비교이지만
        // String의 equals()는 내부적으로 재정의돼있어 "문자열 내용"을 비교.
        // 결론 : 문자열을 논리적으로 비교할때 equals() 사용.
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3.equals(s1) : " + s3.equals(s1));

        s1 += "a";
        System.out.println(s1);

    }
}
