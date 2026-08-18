package useful.ch13;

import java.util.ArrayList;
import java.util.Vector;

public class ChatRoomStore {
    private static Vector<String> users = new Vector<>();
//    private static ArrayList<String> users = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("채팅방 접속자 시뮬레이션");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                users.add("철수");
                System.out.println("[접속] 철수 | 현재 : " + users.size() + "명");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
           users.add("영희");
           System.out.println("[접속] 영희 | 현재 : " + users.size() + "명");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                users.add("민준");
                System.out.println("[접속] 민준 | 현재 : " + users.size() + "명");
            }
        });

        t1.start();
        t2.start();
        t3.start();

        // 내 쓰레드가 종료할때 까지 메인 쓰레드에게 대기(동기화 처리)
        t1.join();
        t2.join();
        t3.join();

        System.out.println("최종 접속자 : " + users);

        users.remove("영희"); // 영희 퇴장.

        // 향상 for문(브로드 캐스트) - 현재 접속한 모든 사용자들에게 메세지 보냄.
        for(String user : users) {
            System.out.println(" -> " + user + "에게 전송 : 안녕하세요");
        }

    }
}


