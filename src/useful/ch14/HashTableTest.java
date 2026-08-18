package useful.ch14;

public class HashTableTest {
    public static void main(String[] args) {
        String[] name = {"사과" , "바나나" , "포도" , "딸기" , "수학"};

        for(String n : name) {
            System.out.println(n + " ->" + n.hashCode());
        }
        System.out.println("==================");
        System.out.println("사과".hashCode());
    }
}
