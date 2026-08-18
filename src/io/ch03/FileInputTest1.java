package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {
    public static void main(String[] args) {
        // 파일을 한 바이트씩 읽어들이는 스트림.
        FileInputStream in = null;
        int readData;

        try {
            in = new FileInputStream("assets/a.txt");
            // 파일의 첫번째 데이터(텍스트)를 한 바이트로 읽기.
            readData = in.read();
            System.out.println("1 : " + readData);
            System.out.println("1 : " + (char)readData);

            // 파일의 두번째 데이터(텍스트)를 한 바이트로 읽기.
            readData = in.read();
            System.out.println("1 : " + readData);
            System.out.println("1 : " + (char)readData);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if(in != null) in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
