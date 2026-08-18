package ch05;

/**
 *증감 , 감소연산자
 * 부호연산자와 다르게 변수에 직접 접근해 오직 1 증가 또는 감소.
 */

public class Operation4 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 1;

        // 증감연산자
        value1++; // value1 = value1 + 1 , value1 += 1
        System.out.println(value1);

        // 감소연산자
        value2--; // value2 = value2 - 1 , value2 -= 1
        System.out.println(value2);

        // 2-1. 증감연산자가 항 앞에 올 경우.(전위연산자) ++10;
        // 2-2. 증감연산자가 항 뒤에 올 경우.(후위연산자) 10++;

        // 증감 전위 연산자.
        int data1 = 10;
        int temp1 = ++data1;
        System.out.println("temp1 : " + temp1 + " , data1 : " + data1);

        // 증감 후위 연산자. 변수에 접근해서 값이 1 증가. 단 세미콜론이 끝난후에 1증가.
        int data2 = 10;
        int temp2 = data2++;
        System.out.println("temp2 : " + temp2 + " , data2 : " + data2);

        // 항이 하나 있을 때 확인.
        int data3 = 10;
        int data4 = 10;
        ++data3;
        data4++;
        System.out.println("data3 : " + data3);
        System.out.println("data4 : " + data4);

        System.out.println("===================================");


        // 문제1. 전위 감소 연산자 , 후위 감소 연산자 사용하고 결과 출력.
        System.out.printf("data1 : %d , data2 : %d\n" , data1 , data2);

        int n1 = data1 + ++data2;
        System.out.printf("data1 : %d , data2 : %d , n1 : %d\n" , data1 , data2 , n1);

        int n2 = data1 + data2++;
        System.out.printf("data1 : %d , data2 : %d , n2 : %d" , data1 , data2 , n2);

    } // end of main
} // end of class
