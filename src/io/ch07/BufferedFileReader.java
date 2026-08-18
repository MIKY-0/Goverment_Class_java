package io.ch07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // 기반 스트림 - 대상은 파일
             fr = new FileReader("assets/a.txt");

            // 보조 스트림 - 기반 스트림을 감싸야 한다.
             br = new BufferedReader(fr);
             String line;

             while ( (line = br.readLine()) != null) { // readLine : 줄바꿈(엔터)기준으로 읽음.
                 System.out.println(line);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                // 감싸고 있는 순서대로 닫아줘야함.
                if(br != null) br.close();
                if(fr != null) fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}