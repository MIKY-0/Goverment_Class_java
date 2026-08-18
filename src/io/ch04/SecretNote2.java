package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNote2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========비밀 메모장==========");
        System.out.print("1. 메모 입력\t2.메모 보기");
        String choice = scanner.nextLine();

        if(choice.equals("1")) {
            saveMemo(scanner);
        } else if (choice.equals("2")) {
            printMemo();
        }
    }

    public static void saveMemo(Scanner scanner) {
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

    public static void printMemo() {
        System.out.println("암호화된 메모");
        try (FileInputStream fis = new FileInputStream("assets/secret.txt")) {
            int data;
            while ( (data = fis.read()) != -1) {
                System.out.println((char)(data - 3));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
