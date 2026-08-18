package useful.ch02;

public class SubStringMain {
    public static void main(String[] args) {
        /*
         substring(index1 , index2) : index1부터 index2 전까지의 문자열 추출.
         H e l l o W o r l d
         0 1 2 3 4 5 6 7 8 9
         */

        // 1. 시작위치부터 끝까지 자르기
        String text = "HelloWorld";
        String result = text.substring(5);
        System.out.println(result);

        // 2. 시작위치부터 끝 위치 전까지 자르기.
        String result2 = text.substring(0 , 5);
        System.out.println(result2);

        // 만들어져있는 모양 맞추기 개념확인
        String result3 = text.substring(2 , 6);
        System.out.println(result3);

        // 주의할점
//        String result4 = text.substring(0 , 20);
//        System.out.println(result4);
    }
}
