package design.single;

public class MainTest {
    public static void main(String[] args) {
        // A.java
        SingleTon singleTonA = SingleTon.getInstance();
        SingleTon singleTonB = SingleTon.getInstance();
        SingleTon singleTonC = SingleTon.getInstance();

        System.out.println(singleTonA);
        System.out.println(singleTonB);
        System.out.println(singleTonC);

        System.out.println(System.identityHashCode(singleTonA));
        System.out.println(System.identityHashCode(singleTonB));
        System.out.println(System.identityHashCode(singleTonC));


        UserService userA = UserService.getInstance();
        UserService userB = UserService.getInstance();
        UserService userC = UserService.getInstance();


        System.out.println(userA);
        System.out.println(userB);
        System.out.println(userC);
    }
}
