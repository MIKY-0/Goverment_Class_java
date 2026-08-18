package useful.ch04;

// 사용자 정의 예외 클래스
public class DivideByZeroException extends RuntimeException{
        private String msg;

    public DivideByZeroException(String msg) {
        super(msg); // RuntimeEception 생성자에 우리가 작성한 msg를 주입. --> e.getMessage() 하면 우리가 작성한 msg나옴.
        this.msg = msg;
    }
}
