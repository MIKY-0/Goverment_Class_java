package ch02;

public class DataType4 {
    public static void main(String[] args) {
        //기본 자료형(논리형)
        // 사실을 관찰하고 결과값이 참인지 거짓인지 판별.
        // 1비트만으로도 참과 거짓의 데이터를 다룰 수 있지만 너무 작은 단위라서 컴퓨터가 연산을 비트단위로 하게되면 되려 연산이 느려진다.
        // --> 최소 컴퓨터 연산의 단위가 1바이트로 연산됨.

        boolean isMarried = false;
        System.out.println(isMarried);
        isMarried = true;
        System.out.println(isMarried);

        boolean isOk;
        isOk = false;
        System.out.println(isOk);
    } // end of main
} // end of class
