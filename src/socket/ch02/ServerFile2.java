package socket.ch02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//    FileWriter
//    FileReader
//    FileInputStream
//    FileOutputStream

//    InputStreamReader
//  OutputStreamWriter
//    InputStream
//    OutputStream

//    BufferedWriter
//    BufferedReader
//    BufferedOutputStream
//    BufferedInputStream
public class ServerFile2 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버측 프로그램 시작 - 포트번호 : 5000에서 대기중... ");
            // 클라이언트가 내 IP주소와 포트번호를 사용해서 연결할때까지 이 줄에서 멈춤.
            Socket socket = serverSocket.accept();

            // 읽기 스트림(문자기반) , 클라이언트 -> 서버
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 쓰기 스트림(문자기반) 서버 -> 클라이언트
            PrintWriter writer = new PrintWriter(socket.getOutputStream() , true);

            // 클라이언트가 보낸 데이터 한줄 읽기.
            String message = reader.readLine();
            System.out.println("클라이언트 메세지 : " + message);

            // 클라이언트에 받은 메세지 파일에 저장. (문자기반)
            FileWriter fis = new FileWriter("assets/d.txt");
//            fis.write(message.getBytes());  // Buffured 안쓰고 바로 저장하는 방법.

            BufferedWriter bos = new BufferedWriter(fis);
            bos.write(message , 0 , 1024);
            bos.flush();

            // 서버가 클라이언트로 응답 메세지 보내기.
            writer.println("안녕 나는 서버야");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
