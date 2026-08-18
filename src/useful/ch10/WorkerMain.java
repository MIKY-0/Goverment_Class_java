package useful.ch10;

public class WorkerMain {
    // 메인 쓰레드
    public static void main(String[] args) {
        // 사용하는 방법.
        System.out.println("=============main 쓰레드 시작=============");
        System.out.println(Thread.currentThread());

        // 필요하다면 작업자(쓰레드)를 만들어서 작업시킬수 있음.
        Worker worker1 = new Worker("작업자1");

        // 약속. 쓰레드에서 위임한 일을 시작시키려면 Thread안에 있는 start() 메서드 반드시 호출해서
        // run()안에 정의된 로직이 시작됨.
        worker1.start();

        System.out.println("==============main 쓰레드 종료==============");

    }
}
