package useful.ch04;

class Calc2 {
    // 예외처리를 사용하는 사람이 직접 다룰 수 있도록 던질 수 있음. 메서드 선언부에서 사용.(throws)
    // 강제성이 발생됨.(사용측에서 반드시 처리해야되는 강제성)
    public int divide(int a , int b) throws DivideByZeroException {
        System.out.println("사용자 정의 예외 클래스");
        int result = 0;

        try {
            result = a / b;
        } catch (Exception e) {
            throw new DivideByZeroException("0으로 나눌 수 없음.");
        }
        return result;
    }
}

public class ThrowsHandling2 {
    public static void main(String[] args) {
        Calc2 calc = new Calc2();
            calc.divide(100, 0);

        }
    }

