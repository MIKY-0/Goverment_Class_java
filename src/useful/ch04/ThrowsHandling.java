package useful.ch04;

class Calc {
    // 예외처리를 사용하는 사람이 직접 다룰 수 있도록 던질 수 있음. 메서드 선언부에서 사용.(throws)
    // 강제성이 발생됨.(사용측에서 반드시 처리해야되는 강제성)
    public int divide(int a , int b) throws DivideByZeroException{
        System.out.println("나누기 동작");
        return a / b;
    }
}


public class ThrowsHandling {
    public static void main(String[] args) {
        Calc calc = new Calc();
        try {
            calc.divide(100 , 0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없음.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
