package useful.ch09;

// 익명 내부 클래스 사용.
public class OuterClass4 {
    Runnable runnable;

    // 생성자
    public OuterClass4() {
        // 익명클래스를 사용해서 인터페이스나 추상클래스를 마치 실제 객체처럼 생성 할 수 있다.
        // runnable = new Runnable();  안됨.
        runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("동작정의");
            }
        };
    }

    public static void main(String[] args) {
        new OuterClass4(); // 이름이 없는 상태.(익명클래스로 생성함)
    }
}
