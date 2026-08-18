package useful.ch04;

class AgeException3 extends Exception{
    public AgeException3(String msg) {
        super(msg);
    }
}

// 방법2. throws 예외클래스 안쓰고 try-catch.
public class Age3 {
    public void checkAge(int a ) {

        try {
            if(a < 0) throw new AgeException3("음수 불가");
        } catch(AgeException3 e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Age3 a = new Age3();
        a.checkAge(-1);
    }
}
