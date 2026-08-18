package useful.ch09;

// 3. 지역 내부 클래스
public class OuterClass3 {
    public void display() {

        class LocalInnerClass {
            void printMessage() {
                System.out.println("지역");
            }
        }
    }

    public static void main(String[] args) {
        // 지역 내부 클래스는 메서드 실행시에만 존재하고 메서드의 지역변수처럼 동작.
        // 외부에서 접근할 수 없으며 주로 메서드 내에서 일회성 작업을 수행하는 객체를 생성할 때 사용 가능.

        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.display();
    }
}
