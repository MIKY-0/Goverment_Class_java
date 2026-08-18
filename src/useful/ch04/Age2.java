package useful.ch04;

// 사용자 정의 예외를 RunTimeException(비체크예외)로 상속받는 경우
class AgeException2 extends RuntimeException{
    public AgeException2(String msg) {
        super(msg);
    }
}


public class Age2 {
    public void checkAge(int a) {
        if(a < 0) {
            throw new AgeException2("나이는 음수가 될 수 없음");
        }
    }

    public static void main(String[] args) {
        Age2 a = new Age2();
        try {
            a.checkAge(-1);
        } catch(AgeException2 e) {
            System.out.println(e.getMessage());
        }
    }
}
