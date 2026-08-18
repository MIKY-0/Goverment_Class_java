package useful.ch10;

// 쓰레드를 사용하는 방법 2번째 - Runnable 인터페이스를 구현해서 만들 수 있음.
public class Worker2  implements Runnable{

    // 위임시키고자 하는 일을 명시하는 곳.
    @Override
    public void run() {
        for(int i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}
