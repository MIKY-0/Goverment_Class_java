package ch07;

public class WhileTest2 {
    public static void main(String[] args) {
        // while - 특정 조건 생길때 반복문 종료.
         boolean flag = true;
         int start = 0;
         final int END = 50;

         while(flag) {
             start++;
             System.out.println("start : " + start);
             if(start == END) {
                 System.out.println("프로그램 종료");
                 return; // 만약 start값이 50이 되면 flag변수를 false로 변경 또는 break 또는 return.
             }
         }
    } // end of main
} // end of class
