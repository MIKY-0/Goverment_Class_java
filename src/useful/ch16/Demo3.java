package useful.ch16;

// 함수형 인터페이스를 자바 API말고 내가 직접 설계해서 사용.
//@FunctionalInterface // ->함수형 인터페이스는 하나의 추상메서드만.
//interface MathOperation {
//    int operate(int x , int y);
//}



public class Demo3 {
    public static void main(String[] args) {
        // 함수형 인터페이스 타입변수에 람다식 담을 수 있음.
        MathOperation add = (x , y) -> {return x + y;};
        MathOperation sub = (x , y) -> {return x - y;};
        MathOperation multiply = (x , y) -> {return x * y;};
        MathOperation divide = (x , y) -> {return x / y;};

        // 주의 : 호출할때는 참조변수의 이름이 아니라 인터페이스에 정의된 메서드 이름을 호출해야함.
        System.out.println("10 + 10 = " + add.operate(10 , 10));
        System.out.println("10 - 10 = " + sub.operate(10 , 10));
        System.out.println("10 * 10 = " + multiply.operate(10 , 10));
        System.out.println("10 / 10 = " + divide.operate(10 , 10));
    }
}
