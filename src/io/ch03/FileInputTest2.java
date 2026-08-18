package io.ch03;

import java.io.FileInputStream;

public class FileInputTest2 {
    public static void main(String[] args) {
        // 파일을 열면 반드시 닫아주는것이 좋지만 반복적 코드가 매번 발생해서 불편함이 있음.
        // 이 불편함을 해결하기 위해 새로운 문법 try-with-resources 제공.

        try(FileInputStream in = new FileInputStream("assets/a.txt")){
            int readData;
            while( (readData = in.read()) != -1) {
                System.out.print((char)readData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // close() 자동 호출됨.
    }
}
