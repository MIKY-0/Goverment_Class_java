package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {
    public static void main(String[] args) {
        // 소켓(5000 포트) 생성.
        // 서버에게 데이터를 요청할 출력 스트림 생성.
        // 서버에게 정해진 문자열이 아닌 사용자가 직접 입력해서 보낼 키보드입력스트림 생성.
        // 내가 키보드로 입력한 데이터를 읽기위해 위에서 생성한 출력스트림으로.
        // "exit" 입력하면 클라이언트의 출력스트림이 끊기고 서버에게서 데이터를 받기 위한 입력 스트림 생성.
        // 서버에게 데이터를 받으면 클라이언트 - 서버 스트림이 모두 끊김.

        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream() , true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while(true) {
                System.out.print("[client]콘솔 로그클라이언트 입력 : ");
                String input = keyboardReader.readLine();
                writer.println(input); // 소켓과 연결된 출력 스트림을 사용해서 서버측에 데이터 보냄.
                if("exit".equalsIgnoreCase(input)) break; // 키보드 입력스트림 종료.

                // 서버측에서 보낸 데이터를 받아서 클라이언트 콘솔창에 출력.
                String res = reader.readLine();
                if("exit".equalsIgnoreCase(res)) break;

                System.out.println("서버측 응답 : " + res);
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
