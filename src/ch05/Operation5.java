package ch05;

/**
 * 관계연산자(비교연산자)
 * 관계연산자의 연산결과는 true , false.
 */
public class Operation5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        boolean result1 = num1 > num2;
        System.out.println(result1);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
    } // end of main
} // end of class
