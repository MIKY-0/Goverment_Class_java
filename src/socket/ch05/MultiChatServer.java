package socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiChatServer {
     private static final int PORT = 5000;
     private static final Vector<PrintWriter> writer = new Vector<>();

     static class ServerStream extends Thread {
        private Socket socket;
        private BufferedReader readerFromClient;
        private PrintWriter writerToClient;

        public ServerStream(Socket socket) {this.socket = socket;}

         @Override
         public void run() {
             try {
                 readerFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 writerToClient = new PrintWriter(socket.getOutputStream());

                 writer.add(writerToClient);

                 String data;
                 while( (data = readerFromClient.readLine()) != null) {
                     System.out.println("수신 : " + data);
                     broadcast(data);
                 }


             } catch (IOException e) {
                 throw new RuntimeException(e);
             } finally {
                 try {
                     socket.close();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }
         }

         private void broadcast(String msg) {
            for(PrintWriter p : writer) {
                p.println(msg);
            }
         }
     }


    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            while (true) {
            ServerStream serverStream = new ServerStream(serverSocket.accept());
            serverStream.start();
                System.out.println("현재 접속자 : " + writer.size());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
