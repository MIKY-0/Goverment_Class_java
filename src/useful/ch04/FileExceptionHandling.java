package useful.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test1.txt");
            return;
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없음");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // return만나도 수행됨.
            System.out.println("수행");
        }

    }
}
