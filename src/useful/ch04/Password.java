package useful.ch04;

class PasswdException extends RuntimeException {
    private String password;

    public PasswdException( String password) {
        super(password);
    }
}


public class Password  {
    private String password;

    public String getPassword() {return password;}

    // 문제 1. 사용자 정의 클래스 설계.
    // 문제 2. 메세지를 받아서 출력할 수 있도록 설계.
    // 문제 3. setPassword에 오류 안내 메세지를 예외 클래스로 활용.

    public void setPassword(String password) {
        if (password == null) {
            throw new PasswdException("비밀번호는 null일 수 없습니다.");
        } else if (password.length() < 4) {
            throw new PasswdException("비밀번호는 4글자 이상이어야 합니다.");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        Password password1 = new Password();
        try {
            password1.setPassword("123");
        } catch (PasswdException e) {
            System.out.println(e.getMessage());
        }
    }
}
