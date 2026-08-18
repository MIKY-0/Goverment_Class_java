package useful.ch02;

public class ReplaceMain {
    public static void main(String[] args) {
        /*
         replace(바꿀 글자 , 바뀌는 글자)
         1. 원본은 바뀌지 않음.
         2. 일치하는 부분을 전부 바꿈.
         3. 두 가지 메서드 오버로딩 존재.
         */

        // 1. char 하나를 다른 char로 바꾸기.
        String fruit = "banana";
        String result1 = fruit.replace("a" , "o");
        System.out.println(result1);

        // 2. 문자열 단위로 바꾸기.
        String phone = "010-1234-1234";
        String result2 = phone.replace("-" , "");
        System.out.println(result2);

        // 3. 활용
        String sentence = "자바는 재미있다. 또는 자바는 어렵기도 하다.";
        String result3 = sentence.replace("자바" , "JAVA");
        System.out.println(result3);

    }
}
