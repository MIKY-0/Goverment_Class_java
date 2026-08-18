package useful.ch03;

public class StringTest2 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");

        System.out.println(str1); // String은 toString이 재정의돼서 주소값이 아닌 문자열이 출력.

        System.out.println(System.identityHashCode(str1)); // 실제 str1의 해시코드값.

        System.out.println();

        // 한번 생성된 문자열은 불변이고 변경이 일어나면 새로 문자열이 생성됨.
//        str1 += "World";
        str1 = str1.concat("World");
        System.out.println("str1 + World : " + str1);
        System.out.println(System.identityHashCode(str1));
    }
}
