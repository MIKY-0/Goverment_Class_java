package design.builder;

public class MainTest1 {
    public static void main(String[] args) {
        Burger burger1 = new Burger.Builder()
                .bread("참깨빵")
                .patty("소고기")
                .sauce("케찹")
                .build();

        System.out.println(burger1);

        Burger burger2 = new Burger.Builder()
                .patty("치킨")
                .bread("호밀빵")
                .build();

        System.out.println(burger2);
    }
}
