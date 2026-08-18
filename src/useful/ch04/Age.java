package useful.ch04;

// 사용자 정의 예외를 Exception(체크예외)로 상속 받은 경우. - 2가지 방법
class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}


// 방법1. throws Exception 사용. 대신 main함수에도 붙여야함.
public class Age {

    public void checkAge(int age) throws AgeException {
        if(age < 0) {
        throw new AgeException("나이는 음수가 될 수 없음");
        }
    }

        public static void main (String[]args) throws AgeException{
            Age a = new Age();
            a.checkAge(-1);
        }
    }



