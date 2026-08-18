package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================타자 연습 기록기======================");
        System.out.print("연습한 문장을 입력하세요 : ");
        LocalTime start = LocalTime.now();
        String input = scanner.nextLine();

        try(FileOutputStream fos = new FileOutputStream("assets/c.txt");) {
            fos.write(input.getBytes());

            LocalTime end = LocalTime.now();
            Duration work = Duration.between(start , end);
            String str = "\n소요시간 : " + work.toMillis() + "ms";
            fos.write(str.getBytes());
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
