package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordBook {
    public static void main(String[] args) {
        // Map을 활용해 영단어사전(apple : 사과) - CRUD

        Scanner scanner = new Scanner(System.in);
        Map<String , String> words = new HashMap<>();

        words.put("apple" , "사과");
        words.put("banana" , "바나나");
        words.put("cherry" , "체리");

        while(true) {
            System.out.println("\n ====== 영한 단어장 ======");
            System.out.println("1. 단어 추가\t2. 단어 검색\t3. 전체 출력\t4. 종료");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 :
                    System.out.print("영단어 입력 : ");
                    String a = scanner.nextLine();
                    System.out.print("한글 입력 : ");
                    String b = scanner.nextLine();
                    words.put(a , b);
                    break;

                case 2 :
                    System.out.print("검색할 영단어 : ");
                    String c = scanner.nextLine();
                    if(words.containsKey(c)) {System.out.println("해당 영단어 없음");}
                    else {System.out.println(words.get(c));}
                    break;

                case 3 :
                    Map<String , String > tm = new TreeMap<>(words);
                    for(String k : tm.keySet()) {System.out.println(k + " : " + tm.get(k));}
                    break;

                case 4 :
                    System.out.println("종료");
                    return;

                default :
                    System.out.println("다시 입력");
            }

        }

    }
}
