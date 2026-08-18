package com.oop13;


public class Notification {
    public void send(String msg) {
        System.out.println("일반 알림 : " + msg);
    }

    public void send(String msg , int count) {
        for(int i = 1; i <= count; i++) {
            System.out.println(i + "번 알림 : " + msg);
        }
    }

    public void send(String receiver , String msg) {
        System.out.println(receiver + "님에게 메세지 : " + msg);
    }

    public static void main(String[] args) {
        Notification n = new Notification();
        String msg = "안녕하세요";

        n.send(msg);
        n.send(msg , 5);
        n.send("이순신" , msg);

    }
}
