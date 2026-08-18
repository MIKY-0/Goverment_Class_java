package ch05;

/**
 * 부호 연산자
 * 단항 연산자 , 변수에 부호를 변경한다.
 * 단 , 변수안에 들어가 있는 값의 부호를 변경하려면 대입연산자와 함께 사용해야 한다.
 */
public class Operation1 {
    public static void main(String[] args) {
        int intData = 100;
        System.out.println(+intData);
        System.out.println(-intData);
        System.out.println();
        System.out.println("intData : " + intData);
        // 위 코드 결과처럼 intData의 값은 바뀌지 않았음. intData앞에 붙인 부호연산자는 값을 변경하지 않는다.
        // 그렇다면 실제 값을 바꾸려면 대입연산자를 함께 사용해야함.
        intData = -intData; // 부호연산자 사용해서 새로 대입하는 개념.
        System.out.println("intData : " + intData);
    } // end of main
} // end of class
