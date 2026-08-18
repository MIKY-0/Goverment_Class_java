package useful.ch10;

public class WorkerMain2 {
    // 메인 쓰레드
    public static void main(String[] args) {
        System.out.println("=====================쓰레드 시작=====================");
        Worker2 worker2 = new Worker2();

        // tip - 쓰레드를 동작시키려면 무조건 Thread의 start() 메서드 호출해야함.
        new Thread(worker2).start();

        System.out.println("=====================쓰레드 종료=====================");

    }
}
