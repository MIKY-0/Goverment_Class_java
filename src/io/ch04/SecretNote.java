package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========비밀 메모장==========");
        System.out.print("저장할 메모 입력 : ");
        String input = scanner.nextLine();

        try(FileOutputStream fos = new FileOutputStream("assets/secret.txt")){

            byte[] encryp = input.getBytes();
            byte[] strEncryp = new byte[encryp.length];

            for(int i = 0; i < encryp.length; i++) {
               strEncryp[i] = (byte)(encryp[i] + 3);
               fos.write(strEncryp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
