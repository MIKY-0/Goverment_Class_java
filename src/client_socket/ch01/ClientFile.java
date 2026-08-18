package client_socket.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.5.9", 5000)) {
            System.out.println("클라이언트 - 서버에 연결했습니다.");

            // 서버측으로 메세지를 보내기 위한 출력스트림 사용.
            // PrintWriter --> autoFlush 해주자.   socket + PrintWriter
            PrintWriter writer = new PrintWriter(socket.getOutputStream() , true);
            writer.println("안녕 서버야, 나는 클라이언트야.");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
