package useful.ch11;

public class Main1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // 엄마와 아빠가 같은 자원을 공유하고 있음(같은 공간을 사용. - 임계영역)
        // 같은 공간의 같은 자원을 공유 - shared source
        Father father = new Father(bankAccount); // 입금 일 위임 -> 1만원 입금.
        father.start();
        Mother mother = new Mother(bankAccount); // 출금 일 위임 -> 5천원 출금.
        mother.start();

        // 위 해결 방안은 자바에서 동기화 처리로 해결할 수 있음.
        // BankAccount클래스의 입출금 메서드에 synchronized 붙임.
    }
}
