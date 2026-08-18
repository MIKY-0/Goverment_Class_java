package useful.ch09;

/**
 * 내부 클래스란 (4가지)
 * 한 클래스 내부에 선언된 클래스. 내부클래스를 선언하면 보통 외부 클래스와 연관있는 경우의 클래스가 많고
 * 다른곳에서 거의 사용할 일이 없을 경우 내부에 클래스 선언.
 */

public class OuterClass1 {
    private int num = 10;

    // 1. 멤버 내부클래스
    class InnerClass {
        public void display() {
            System.out.println("num : " + num);
        }
    }

    public static void main(String[] args) {
        // 내부 클래스가 일반 멤버클래스로 설계된 경우.
        // 외부 클래스가 먼저 객체로 생성된 후 내부 클래스 객체 생성가능.
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass innerClass = outerClass1.new InnerClass();
        innerClass.display();
    }
}
