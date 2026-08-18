package useful.ch16;

public class Demo1 {
    public static void main(String[] args) {
        // 1.
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("작업자가 해야할 일 정의");
            }
        }).start();

        // 2. 위 코드를 람다식으로
        new Thread( () -> System.out.println("작업자가 해야할 일 정의")).start();

        // 3. 자바 컴파일러는 타입 추론 가능.
        new Thread( () -> System.out.println("작업자가 해야할 일 정의")).start();

    }
}
