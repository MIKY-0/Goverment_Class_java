package useful.ch16;

public class Demo5 {
    public static void main(String[] args) {
        // 배웠던 익명클래스와 동작이 완전 같음.
        // 익명클래스 방식)
        MathOperation add1 = new MathOperation() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };

        // 람다 방식)
        MathOperation add2 = (int x, int y) ->  x + y;

        System.out.println("익명클래스 : " + add1.operate(100 , 100));
        System.out.println("람다식 : " + add2.operate(100 , 100));

    }
}
