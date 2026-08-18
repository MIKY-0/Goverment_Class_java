package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "uploads";

    /*
    서버 - 클라이언트 약속(프로토콜)
    [1바이트] 파일의 이름 길이 ( 0 ~ 255) --> [1] [1] [1] [1] [1] [1] [1] [1]
    [N바이트] 파일 이름
    [나머지] 파일 내용 (클라이언트가 출력방향을 닫으면 끝(-1 , EOF))
     */

    public static void main(String[] args) {
        // File 객체 = 경로가 적힌 쪽지일 뿐 실제 폴더나 파일이 아님.
        // 아래 한줄로는 uploads폴더가 만들어 지지 않음. 그냥 uploads경로를 가리키는 객체가 생성된 것뿐.
        File dir = new File(UPLOAD_DIR);
        File dir2 = new File("assets/uploads");

        if(!dir.exists()) { // dir("uploads) 폴더가 없으면
            // mkdirs() : 이를 호출하는 이 순간에 비로써 실제 폴더를 만들 수 있음.
            // mkdir() : mkdirs()과 달리 중간 경로까지 한번에 만들어줌.
            boolean created = dir.mkdirs();
            System.out.println("업로드 폴더 생성." + created);
        }

        System.out.println("파일 서버 시작 - 포트 : " + PORT);
        System.out.println("");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket socket = serverSocket.accept(); // 연결 될 때까지 이코드에서 블로킹 상태.
            System.out.println("클라이언트 연결됨 : " + socket.getInetAddress().getHostAddress());

            // 소켓에 연결된 입출력 스트림 준비.
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            // --------------------------------------------
            // 1단계 : 파일 이름의 길이 읽기. (1바이트)
            // --------------------------------------------

            // byte가 아니라 int 돌려주는 이유.
            // byte는 -128 ~ 127 이라 "끝(-1)"을 표현할 자리가 없음.
            // 그래서 0 ~ 255는 데이터를 구분해서 -1이 들어오면 끝 신호로 구분해서 쓴다.(read())
            int nameLength = in.read();

            // 방어적 코드
            // 이 검사를 빼면 아래에서 new byte[-1]이 되어 오류가 발생.
            if(nameLength == -1) {
                System.out.println("클라이언트가 아무것도 보내지 않고 종료했습니다.");
                return;
            }
            System.out.println("파일의 이름 길이 : " + nameLength + "바이트로 들어온다고 확인됨.");

            // --------------------------------------------
            // 2단계 : 파일 이름을 정확하게 nameLength 만큼 읽기.
            // --------------------------------------------

            byte[] nameBuffer = new byte[nameLength];
            int nameRead = 0;

            // 이 while문이 2단계의 가장 핵심.
            // read(값을 담을 배열 , 시작위치 , 최대 읽을 개수)는 요청한 만큼 반드시 읽어준다는 보장이 없음.
            // 네크워크 사정에 따라 총 30바이트를 받는다 가정하면 첫번째에 3바이트만 올 수 있음.
            while(nameRead < nameLength) {
                int count = in.read(nameBuffer , nameRead , nameLength - nameRead);
                if(count == -1) throw new IOException("파일 이름을 받는 중에 연결이 끊겼습니다.");
                nameRead += count; // 받은 만큼 커서를 앞으로 민다. 이 코드 없으면 무한루프.
            }
            // 예) a.zip을 받는 경우 --> [5] [a] [.] [z] [i] [p] [.....파일 내용]

            String fileName = new String(nameBuffer); // 바이트로 들어온 데이터를 문자열로 생성함.

            // 방어적 코드 : 악의적인 클라이언트가 "../../비밀.txt"와 같은 이름을 보내면
            // 상위 -> 상위 폴더로 가서 txt파일을 만들수 있음.
            if(fileName.contains("..") || fileName.contains("/") || fileName.contains("\\")) {
                System.out.println("허용되지 않는 파일 이름입니다 : " + fileName);
                return;
            }
            System.out.println("수신할 파일이름 : " + fileName);

            // --------------------------------------------
            // 3단계 : 파일 내용을 받아서 서버측 컴퓨터 디스크에 저장.
            // --------------------------------------------

            // 여기서도 아직 파일은 만들어지지 않음. 경로를 가리키는 객체일 뿐.
            File target = new File(dir , fileName);

            // FileOutputStream 생성자가 실행되는 순간 비로써 디스크에 실제 파일 생김.(있으면 내용이 지워지고 새로 시작)
            FileOutputStream fos = new FileOutputStream(target);
            byte[] buffer = new byte[4096]; // 4kb 운영체제가 디스크를 다루는 단위와 맞춤크기.
            int bytesRead;
            long total = 0;

            // 클라이언트가 shutdownOutput() 을 호출하면 클라이언트가 소켓 close전에 -1을 보낼 수 없음.
            // 그 신호가 도착해서 read()가 -1을 반환.
            while ( (bytesRead = in.read(buffer)) != -1 ) {
                fos.write(buffer , 0 , bytesRead);
                total += bytesRead;
            }
            System.out.println("저장완료 : " + target.getParent() + "총 " + total + "바이트");

            // --------------------------------------------
            // 4단계 : 완료 응답 전송.
            // --------------------------------------------
            // 클라이언트 출력 방향만 닫았고 입력 방향은 살아 있으므로 서버가 보낸 응답을 정상적으로 받을 수 있음.
            out.write(("업로드 성공 : " + fileName).getBytes());
            out.flush(); // 통로에 남은 데이터를 다 밀어냄.


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
