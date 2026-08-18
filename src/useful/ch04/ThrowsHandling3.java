package useful.ch04;

class Calc3 {
    public int divide(int a , int b) throws DivideByZeroException {
        System.out.println("사용자 정의 예외 클래스");
        int result = 0;
       if(b == 0) throw new DivideByZeroException("0으로 나누기 불가");
        return result;
    }
}

public class ThrowsHandling3 {
    public static void main(String[] args) {
        Calc2 calc = new Calc2();
        try {
        calc.divide(100, 0);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

