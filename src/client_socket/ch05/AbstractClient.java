package client_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public abstract class AbstractClient {
    private String name;
    private Socket socket;
    private PrintWriter socketWriterStream;
    private BufferedReader socketReaderStream;
    private BufferedReader keyboardReaderStream;

    public AbstractClient(String name) {
        this.name = name;
    }

    // 메서드를 통해서 socket 주입 받음.
    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public final void run() {
        try {
            connectToServer();
            setupStreams();
            startCommunication();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    // 상속받은 자식클래스는 무조건 이 메서드를 재정의 해야함.
    protected abstract void connectToServer();

    private void setupStreams() throws IOException {
        socketWriterStream = new PrintWriter(socket.getOutputStream() , true);
        socketReaderStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReaderStream = new BufferedReader(new InputStreamReader(System.in));
    }

    private void startCommunication() throws InterruptedException {
        // 1. 서버에서 보낸 데이터 받기.
        Thread readThread = new Thread(() -> {
            String msg;
            try {
                while( (msg = socketReaderStream.readLine()) != null ) {
                    System.out.println(msg);
                }
            } catch (Exception e) {
                System.err.println("서버와의 연결이 끊겼습니다.");

            }
        });

        // 2. 키보드에서 값을 받아 서버로 메세지 전송.
        Thread writeThread = new Thread( () -> {
            String input;
            try {
                while( (input = keyboardReaderStream.readLine()) != null) {
                    socketWriterStream.println("[" + name + "]" + input);
                }
            } catch (IOException e) {
                System.err.println("메시지 전송중 오류발생.");
            }
        });
        readThread.start();
        writeThread.start();

            readThread.join();
            writeThread.join();

    }

}
