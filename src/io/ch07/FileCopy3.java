package io.ch07;

import java.io.*;

public class FileCopy3 {

    public static void main(String[] args) {
        // 1. 파일 위치를 지정한다 (원본 경로, 복사될 경로)
        // 2. 스트림 (File I/O) - 바이트 기반
        // 3. 소요시간 측정

        String sourceFilePath = "assets/employees.zip";
        String destinationFilePath = "assets/employees123_copy.zip";
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
            ) {
                byte[] buffer = new byte[1024];
                int byteReader;
                while ((byteReader = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, byteReader);
                }
            System.out.println("파일 복사 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("나노 초 : " + duration);
        System.out.println("초 값 : " + duration / 1_000_000_000.0);
    }
}

