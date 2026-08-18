package useful.ch16;

@FunctionalInterface
interface max {
    int biggerThan(int a , int b);
}


public class Lambda1 {
    public static void main(String[] args) {
        max m = (a , b) ->  a > b ? a : b;
        System.out.println("더 큰 수 : " + m.biggerThan(10 , 20));

    }
}
