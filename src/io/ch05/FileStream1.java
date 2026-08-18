package io.ch05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStream1 {
    public static void main(String[] args) {
        writeToFile("w1.txt");

    }

    // 파일에 텍스트 쓰는 메서드(문자기반)
     public static void writeToFile(String fileName) {
         try (FileWriter fw = new FileWriter("assets/" + fileName)) {
             String text = "자바 문자 기반 스트림 예제\n";
             fw.write(text);
             fw.write("추가 문자열을 기록합니다");
             System.out.println("파일에 텍스트를 잘 기록했습니다");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }

     // 파일에서 텍스트 읽는 메서드(문자기반)
     public static void readFromFile(String fileName) {
         try (FileReader fileReader = new FileReader("assets/" + fileName + ".txt")) {
             int charCode;
             while (  (charCode = fileReader.read()) != -1 ) {
                 System.out.print((char)charCode);
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}
