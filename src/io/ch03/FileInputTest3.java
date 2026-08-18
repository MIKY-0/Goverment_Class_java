package io.ch03;

import java.io.FileInputStream;

public class FileInputTest3 {
    public static void main(String[] args) {
        // 파일을 열면 반드시 닫아주는것이 좋지만 반복적 코드가 매번 발생해서 불편함이 있음.
        // 이 불편함을 해결하기 위해 새로운 문법 try-with-resources 제공.

        // in.read(byte[] b) 를 사용해서 코드 완성.

        // 데이터를 담아 둘 그릇을 미리 만들어둠.
        // 크기10 = 한번에 최대 10바이트까지 읽어 오겠다 설정.
        try(FileInputStream in = new FileInputStream("assets/a.txt")){
            // read(byte[])는 읽은 바이트 수를 반환.
            // read()가 바이트 값 자체를 돌려주는 것과 다름.
            int readCnt;
            byte[] buffer = new byte[10];

            // [a][b][c][d][e][]
            while( (readCnt = in.read(buffer)) != -1) {
                // buffer.length
                for(int i = 0; i < readCnt; i++) {
                    System.out.print((char) buffer[i]);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // close() 자동 호출됨.
    }
}
