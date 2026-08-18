package client_socket.ch06;

import javax.sound.sampled.Port;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *  서버와 미리 약속한 데이터 순서 준수(프로토콜)
 *  [1바이트] 파일 이름의 길이(0 ~ 255)
 *  [N바이트]  파일 이름
 *  [나머지] 파일 내용
 */
public class FileClient {
    private static String HOST = "192.168.5.9";
    private static int PORT = 5000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("전송할 파일 경로 예) C:\\work_java\\test.txt");
//        String filePath = scanner.nextLine();
        String filePath = "C:\\Users\\user\\Documents\\Lightshot\\aaa.png";

        File file = new File(filePath);
        if(file.exists() || file.isFile()) {
            System.out.println("파일이 존재하지 않거나 폴더 경로입니다." + filePath);
            return;
        }

        // 클라이언트 입장에서는 서버측에 경로를 제외하고 파일 명만 보내야함.
        // C:\work_java\test.txt --> test.txt만 경로에서 걸러내야함. 경로를 통째로 보내면 서버가 엉뚱한 위치에
        // 저장하므로 이름만 보냄.
        String fileName = file.getName();
        byte[] nameBytes = fileName.getBytes();

        // 이름의 길이를 1바이트에 담아 보내므로 255를 넘으면 안됨.(프로토콜)
        // 한글은 UTF - 8기준에서 한 글자가 3바이트라서 최대 85글자 정도 한계.
        if(nameBytes.length > 255) {
            System.out.println("파일 이름이 너무 깁니다.");
            return;
        }
        System.out.println("전송할 파일 : " + fileName + "(" +file.length() +  "바이트)" );

        try (Socket socket = new Socket(HOST, PORT)) {
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

            // --------------------------------------------
            // 1단계 : 파일 이름 길이 전송(1바이트)
            // --------------------------------------------
        out.write(nameBytes.length);

        // --------------------------------------------
            // 2단계 : 파일 이름 전송(N바이트)
            // --------------------------------------------
            out.write(nameBytes);

            // --------------------------------------------
            // 3단계 : 파일 내용 전송
            // --------------------------------------------
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    out.write(buffer , 0 , bytesRead);
                }
            }
            out.flush();

            // --------------------------------------------
            // 4단계 : 다 보냈다고 신호 보내기.
            // --------------------------------------------
            socket.shutdownOutput();
            // 소켓의 나가는 방향만 닫는다. 다 종료 해버리면 들어오는 스트림도 닫혀서 응답을 받을 수 없음.
            System.out.println("전송 완료");

            // --------------------------------------------
            // 5단계 : 서버 응답 수신
            // --------------------------------------------
            byte[] responseBuffer = new byte[1024];
            int responseLength = in.read(responseBuffer);
            if(responseLength > 0) {
                System.out.println("서버 응답 : " + new String(responseBuffer , 0 , responseLength));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
