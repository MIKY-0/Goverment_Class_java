package useful.ch16;

class Calculator {
    public int add(int a , int b) {return a + b;}
    public int sub(int a , int b) {return a - b;}
}
// 원래 방식 : 두 수를 더하거나 뺴는 기능을 만들려면 클래스를 설계하고 객체를 만들고
// 메서드를 호출하는 기본적인 3단계를 거쳐야함.


public class Demo2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("10 + 5 : " + cal.add(10 , 5));
        System.out.println("10 - 5 : " + cal.sub(10 , 5));
    }
}
