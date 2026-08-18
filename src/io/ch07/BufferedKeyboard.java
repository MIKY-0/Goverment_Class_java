package io.ch07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class BufferedKeyboard  {
    public static void main(String[] args) {
        // 키보드에서 데이터를 보조기반스트림을 활용해 받아내고 콘솔에 출력.(바이트 기반)
        try (BufferedInputStream bis = new BufferedInputStream(System.in) ;
            BufferedOutputStream bos = new BufferedOutputStream(System.out)
        ) {

             byte[] buffer = new byte[1024];
             int byteReader;
             while( (byteReader = bis.read(buffer)) != -1) {
                 bos.write(buffer , 0 , byteReader); // 읽은 만큼만 씀.
             }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

