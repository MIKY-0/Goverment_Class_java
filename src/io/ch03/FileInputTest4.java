package io.ch03;

import java.io.FileInputStream;
import java.time.Duration;
import java.time.LocalTime;

public class FileInputTest4 {
    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("assets/b.txt")){

            int readCnt;
            byte[] buffer = new byte[255];

            LocalTime start = LocalTime.now();

            while( (readCnt = in.read(buffer)) != -1) {

                for(int i = 0; i < readCnt; i++) {
                    System.out.print((char) buffer[i]);
                }
            }

            LocalTime end = LocalTime.now();

            Duration work = Duration.between(start , end);
            System.out.println("\n파일 읽기 시간 : " + work.toMillis() + "ms");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
