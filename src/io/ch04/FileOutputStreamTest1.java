package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args){
        String data = "Hello, Java FileOutputStream...";
        FileOutputStream fos = null;
//        new FileOutputStream("assets/c.txt" );
//        new FileOutputStream("assets/c.txt" , true); // 기존 파일에 있는 데이터에 덮어쓰지말고 텍스트를 추가.
        try {
            fos = new FileOutputStream("assets/c.txt");
            fos.write(97);
            fos.write(98);
            fos.write(99);

            fos.write(data.getBytes());

            // 물을 내리다.
            fos.flush();
            // 단 fos.close() 메서드를 호출하면 자동으로 flush() --> close()가 됨.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
