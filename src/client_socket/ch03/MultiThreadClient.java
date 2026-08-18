package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.5.101", 5002)) {
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));


            Thread readThread = new Thread(() -> {
                String serverMessage;
                try {
                    System.out.println("클라언트 시작 읽기 ");
                    while ((serverMessage = reader2.readLine()) != null) {
                        if (serverMessage.equalsIgnoreCase("exit")) {
                            System.out.println("서버에서 종료하였습니다.");
                            break;
                        }
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    System.err.println("서버가 강제로 연결을 끊었습니다.");
                }
            });


            Thread writeThread = new Thread(() -> {
                String myInput;
                try {
                    while ((myInput = keyboardReader.readLine()) != null) {
                        int sendTime = 1;
                        if (myInput.equalsIgnoreCase("exit")) {
                            System.out.println("클라이언트에서 종료하였습니다.");
                            break;
                        }else if (myInput.length() >= 20) {
                            System.out.println("20자 이내로 적어주세요.");
                            continue;
//                        } else if(sendTime > 0){
//                            new Thread( () -> {
//                                try {
//                                    int time = 5;
//                                    while(time > 0) {
//                                        System.out.println(time + "초 동안 메세지를 보낼 수 없습니다.");
//                                        time--;
//                                        Thread.sleep(1000);
//                                    }
//                                } catch (InterruptedException e) {
//                                    throw new RuntimeException(e);
//                                }
//                            }).start();
                        }
                        writer.println(myInput);
                    }
                } catch (IOException e) {
                    System.err.println("클라이언트가 강제로 연결을 끊었습니다.");
                }
            });

            readThread.start();
            writeThread.start();

            readThread.join();
            writeThread.join();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("연결 안됨");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------");
    }
}
