package client_socket.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile2 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("========================서버 연결 완료========================");

            // 쓰기 스트림 (클라이언트 -> 서버)
            PrintWriter writer = new PrintWriter(socket.getOutputStream() , true);

            // 읽기 스트림(서버 -> 클라이언트)
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 서버측으로 보낼 메세지
            writer.println("안녕 서버야~~~~~~~~~~~");

            // 서버 응답 수신
            String res = reader.readLine();
            System.out.println("서버 응답 : " + res);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
