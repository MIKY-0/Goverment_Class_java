package socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5001)) {
            System.out.println("서버실행");
            Socket socket = serverSocket.accept();
            System.out.println("===================서버 실행, 클라이언트 연결됨===================");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 쓰레드 : 클라이언트
            Thread readThread = new Thread(() -> {
                String clientMessage;
                try {
                    while( (clientMessage = reader.readLine()) != null ) {
                        if("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트가 종료를 원합니다");
                            break;
                        }
                        System.out.println("[클라이언트 측 메시지] : " + clientMessage);
                    }
                } catch (IOException e) {
                    System.err.println("클라이언트가 강제로 연결을 끊었습니다.");
                }
            });

            // 쓰기 쓰레드 : 키보드에서 값을 입력받아서 클라이언트에게 전달.
            Thread writeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String serverMessage;
                    try {
                        while ((serverMessage = keyboardReader.readLine()) != null) {

                            if("exit".equalsIgnoreCase(serverMessage)) {
                                writer.println(serverMessage);
                                System.out.println("서버가 종료했습니다.");
                                break;
                            }
                            else if (serverMessage.length() >= 20) {
                                System.out.println("20자 이내로 적어주세요.");
                                continue;
                            }
                            writer.println("[서버]응답 메세지 : " + serverMessage);
                        }
                    }catch (IOException e) {
                        throw  new RuntimeException(e);
                    }
                }
            });

            readThread.start();
            writeThread.start();

            readThread.join();
            writeThread.join();

            // 메인 쓰레드에게 내가 종료될때까지 기다려.

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
